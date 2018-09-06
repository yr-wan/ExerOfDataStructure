package yrwan02;

import org.junit.Test;

public class SortTest {
	/**
	 * junit≤‚ ‘¿‡
	 */
	@Test
	public void sortTest() {
		int[] arr = new int[] { 45, 30, 1, 5, -7 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		BubbleSort.bubbleSort2(arr);
		SelectSort.selectSort(arr);
//		InsertSort.insertSort(arr);
		
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
