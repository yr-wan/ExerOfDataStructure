package yrwan09;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * ������:���롢���ҡ�ɾ��������
 * 
 * @author Wyran
 *
 */
public class Tree {
	public Node root;// ���ڵ�

	/**
	 * ����ڵ�:�Ӹ��ڵ㿪ʼ������Ӧ�ڵ㣬����ڵ���Ϊ�²���ڵ�ĸ��ڵ㡣
	 * 
	 * @param value
	 */
	public void insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return;
		} else {
			Node current = root;
			Node parentNode = null;
			while (true) {
				parentNode = current;
				if (value < current.data) {
					current = current.leftChild;
					if (current == null) {
						parentNode.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parentNode.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	/**
	 * ���ҽ��:�Ӹ��ڵ㿪ʼ����
	 * �١�����ֵС�ڵ�ǰ�ڵ�ֵ����������������
	 * �ڡ�����ֵ���ڵ�ǰ�ڵ�ֵ����������������
	 * �ۡ�����ֵ���ڵ�ǰ�ڵ�ֵ��ֹͣ��������ֹ��������
	 * 
	 * @param value
	 * @return
	 */
	public Node find(int value) {
		Node current = root;
		while (current != null) {
			if (current.data > value) {// ��ǰֵ�Ȳ���ֵ������������
				current = current.leftChild;
			} else if (current.data < value) {// ��ǰֵ�Ȳ���ֵС������������
				current = current.rightChild;
			} else {
				return current;
			}
		}
		return null;// û�ҵ����򷵻�null
	}

	/**
	 * ǰ�����:���ڵ㡪��>����������>������
	 * 
	 * @param node
	 */
	public void preOrder(Node current) {
		if (current != null) {
			System.out.print(current.data + " ");
			preOrder(current.leftChild);
			preOrder(current.rightChild);
		}
	}

	/**
	 * �������:����������>���ڵ㡪��>������
	 * 
	 * @param node
	 */
	public void inOrder(Node current) {
		if (current != null) {
			inOrder(current.leftChild);
			System.out.print(current.data + " ");
			inOrder(current.rightChild);
		}
	}

	/**
	 * �������:����������>����������>���ڵ�
	 * 
	 * @param node
	 */
	public void postOrder(Node current) {
		if (current != null) {
			postOrder(current.leftChild);
			postOrder(current.rightChild);
			System.out.print(current.data + " ");
		}
	}

	/**
	 * �������
	 * 
	 * @param current
	 */
	public void bfsOrder(Node current) {
		if(current != null){
			Queue<Node> queue = new ArrayDeque<>();
			queue.offer(current);
			while(!queue.isEmpty()){
				current = queue.poll();
				System.out.print(current.data + " ");
				if(current.leftChild != null){
					queue.offer(current.leftChild);
				}
				if(current.rightChild != null){
					queue.offer(current.rightChild);
				}
			}
		}
	}

	/**
	 * ɾ�����
	 * 
	 * @param value
	 */
	public boolean delete(int value) {
		Node current = root;// ��ɾ���ڵ�
		Node parentNode = root;
		boolean isLeftChild = false;// �жϴ�ɾ���ڵ������ӻ����Һ���

		while (current.data != value) {
			parentNode = current;
			if (current.data > value) {// ��ǰֵ�Ȳ���ֵ������������
				current = current.leftChild;
				isLeftChild = true;
			} else {// ��ǰֵ�Ȳ���ֵС������������
				current = current.rightChild;
				isLeftChild = false;
			}
			if (current == null) {// ��ɾ��ֵ������
				return false;
			}
		}

		// �ٸýڵ�û���ӽڵ㣬��Ҷ�ӽ��
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parentNode.leftChild = null;
			} else {
				parentNode.rightChild = null;
			}
		} else if (current.rightChild == null && current.leftChild != null) {// �ڸýڵ�ֻ��һ�����ӽڵ�
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parentNode.leftChild = current.leftChild;
			} else {
				parentNode.rightChild = current.leftChild;
			}
		} else if (current.leftChild == null && current.rightChild != null) {// �ڸýڵ�ֻ��һ�����ӽڵ�
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parentNode.leftChild = current.rightChild;
			} else {
				parentNode.rightChild = current.rightChild;
			}
		} else {// �۸ýڵ��������ӽڵ�
			Node successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parentNode.leftChild = successor;
			} else {
				parentNode.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}

		return true;
	}

	/**
	 * ���Ҵ�ɾ���ڵ�������̽ڵ�
	 * 
	 * @param delNode ��ɾ���ڵ�
	 * @return �����̽ڵ�
	 */
	public Node getSuccessor(Node delNode) {
		Node successor = delNode;// �����̽ڵ�
		Node successorParent = delNode;// �����̽ڵ�ĸ��ڵ�
		Node current = delNode.rightChild;// ��ɾ���ڵ�����ӽڵ㿪ʼ

		while (current != null) {// ��������������һ��û�����ӵĽڵ�
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		// ��������̽ڵ㲻�Ǵ�ɾ���ڵ���Һ��� �Ѵ��ƶ�������ȫ���ƶ���
		if (successor != delNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	
	// �ǵݹ�ʵ�ֱ���
	/**
	 * �ǵݹ�ǰ�����
	 */
	public void nonRecursivePreOrder(Node current) {
		Stack<Node> stack = new Stack<Node>();
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				System.out.print(current.data + " ");
				stack.push(current);
				current = current.leftChild;
			} else {
				current = stack.pop();
				current = current.rightChild;
			}
		}
	}
}
