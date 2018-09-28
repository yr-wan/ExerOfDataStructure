package yrwan09;

import java.util.Arrays;

// 根据前序，中序，重建二叉树
public class RebuildTree {
	/**
	 * 
	 * @param pre 前序遍历
	 * @param in 中序遍历
	 * @param index 根节点
	 * @return
	 */
	public static Node rebuildTree(int[] pre, int[] in) {
		if (pre == null || in == null || pre.length == 0 || in.length == 0 || pre.length != in.length) {
			return null;
		}
		Node current = new Node(pre[0]);
		for (int i = 0; i < in.length; i++) {
			if (pre[0] == in[i]) {
				current.leftChild = rebuildTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
				current.rightChild = rebuildTree(Arrays.copyOfRange(pre, i + 1, pre.length),
						Arrays.copyOfRange(in, i + 1, in.length));
			}
		}
		return current;
	}

	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.leftChild);
			postOrder(root.rightChild);
			System.out.print(root.data + " ");
		}
	}
}
