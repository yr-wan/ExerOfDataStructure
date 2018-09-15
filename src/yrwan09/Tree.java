package yrwan09;

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
	 * ɾ�����
	 * 
	 * @param value
	 */
	public void delete(int value) {
		// TODO
	}
}
