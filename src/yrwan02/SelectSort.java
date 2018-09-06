package yrwan02;

public class SelectSort {
	/**
	 * 改进的选择排序 设置一个变量minIndex存储较小元素的数组下标
	 * 
	 * @param arr
	 */
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {// 第i轮，i前的元素已排好
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				Swap.swap(arr, minIndex, i);// 如果minIndex发生变化，则进行交换
			}
		}
	}
}
