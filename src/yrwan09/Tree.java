package yrwan09;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树:插入、查找、删除、遍历
 * 
 * @author Wyran
 *
 */
public class Tree {
	public Node root;// 根节点

	/**
	 * 插入节点:从根节点开始查找相应节点，这个节点作为新插入节点的父节点。
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
	 * 查找结点:从根节点开始遍历
	 * ①、查找值小于当前节点值，则搜索左子树；
	 * ②、查找值大于当前节点值，则搜索右子树；
	 * ③、查找值等于当前节点值，停止搜索（终止条件）；
	 * 
	 * @param value
	 * @return
	 */
	public Node find(int value) {
		Node current = root;
		while (current != null) {
			if (current.data > value) {// 当前值比查找值大，搜索左子树
				current = current.leftChild;
			} else if (current.data < value) {// 当前值比查找值小，搜索右子树
				current = current.rightChild;
			} else {
				return current;
			}
		}
		return null;// 没找到，则返回null
	}

	/**
	 * 前序遍历:根节点——>左子树——>右子树
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
	 * 中序遍历:左子树——>根节点——>右子树
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
	 * 后序遍历:左子树——>右子树——>根节点
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
	 * 层序遍历
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
	 * 删除结点
	 * 
	 * @param value
	 */
	public boolean delete(int value) {
		Node current = root;// 待删除节点
		Node parentNode = root;
		boolean isLeftChild = false;// 判断待删除节点是左孩子还是右孩子

		while (current.data != value) {
			parentNode = current;
			if (current.data > value) {// 当前值比查找值大，搜索左子树
				current = current.leftChild;
				isLeftChild = true;
			} else {// 当前值比查找值小，搜索右子树
				current = current.rightChild;
				isLeftChild = false;
			}
			if (current == null) {// 待删除值不存在
				return false;
			}
		}

		// ①该节点没有子节点，是叶子结点
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parentNode.leftChild = null;
			} else {
				parentNode.rightChild = null;
			}
		} else if (current.rightChild == null && current.leftChild != null) {// ②该节点只有一个右子节点
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parentNode.leftChild = current.leftChild;
			} else {
				parentNode.rightChild = current.leftChild;
			}
		} else if (current.leftChild == null && current.rightChild != null) {// ②该节点只有一个左子节点
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parentNode.leftChild = current.rightChild;
			} else {
				parentNode.rightChild = current.rightChild;
			}
		} else {// ③该节点有两个子节点
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
	 * 查找待删除节点的中序后继节点
	 * 
	 * @param delNode 待删除节点
	 * @return 中序后继节点
	 */
	public Node getSuccessor(Node delNode) {
		Node successor = delNode;// 中序后继节点
		Node successorParent = delNode;// 中序后继节点的父节点
		Node current = delNode.rightChild;// 待删除节点的右子节点开始

		while (current != null) {// 向左子树遍历到一个没有左孩子的节点
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}

		// 如果中序后继节点不是待删除节点的右孩子 把待移动的子树全部移动完
		if (successor != delNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	
	// 非递归实现遍历
	/**
	 * 非递归前序遍历
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
