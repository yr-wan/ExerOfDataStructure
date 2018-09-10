package yrwan08;

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
		
//		ShellSort.shellSort(arr);
		QuickSort.quickSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
