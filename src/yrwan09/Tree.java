package yrwan09;

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
	 * 删除结点
	 * 
	 * @param value
	 */
	public void delete(int value) {
		// TODO
	}
}
