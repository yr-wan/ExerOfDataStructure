package yrwan09;

import org.junit.Test;

public class RebuildTreeTest {

	@Test
	public void test() {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		Node root = RebuildTree.rebuildTree(pre, in);
		RebuildTree.postOrder(root);
	}

}
