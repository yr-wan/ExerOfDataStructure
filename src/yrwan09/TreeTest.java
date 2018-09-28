package yrwan09;

import org.junit.Test;

public class TreeTest {
	@Test
	public void treeTest() {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(3);
		tree.insert(15);
		tree.insert(42);
		tree.insert(37);
		tree.insert(19);
		tree.insert(12);

		System.out.println(tree.root.data);
		System.out.println("--------");
		System.out.println(tree.find(15).data);

		System.out.println("\n----前序遍历----");
		tree.preOrder(tree.root);
		System.out.println("\n----非递归前序遍历----");
		tree.nonRecursivePreOrder(tree.root);
		System.out.println("\n----中序遍历----");
		tree.inOrder(tree.root);
		System.out.println("\n----后序遍历----");
		tree.postOrder(tree.root);
		System.out.println("\n----层序遍历----");
		tree.bfsOrder(tree.root);

		System.out.println("\n--------");
		tree.delete(3);
		tree.inOrder(tree.root);

		System.out.println("\n--------");
		tree.delete(15);
		tree.inOrder(tree.root);
	}
}
