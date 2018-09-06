package yrwan02;

public class BubbleSort {
	/**
	 * 冒泡排序 从后向前冒泡
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {// 第i轮，i前的元素已排好
			boolean flag = true;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[i]) {
					Swap.swap(arr, j, i);
				}
				flag = false;
			}
			if (flag) {
				break;// 某一轮没有交换，则意味着已排好顺序
			}
		}
	}
}
