package yrwan02;

public class BubbleSort {
	/**
	 * 冒泡排序 外循环仅代表排序的趟数，内循环表示每轮参与比较的元素下标，向右冒泡
	 * 
	 * @param arr
	 */
	public static void bubbleSort1(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {// 第i轮
			boolean flag = true;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					Swap.swap(arr, j, j + 1);
				}
				flag = false;
			}
			if (flag) {
				break;// 某一轮没有交换，则意味着已排好顺序
			}
		}
	}
	/**
	 * 冒泡排序 从左冒泡
	 * 
	 * @param arr
	 */
	public static void bubbleSort2(int[] arr) {
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
