package yrwan07;

import java.util.Arrays;

import org.junit.Test;

/**
 * 递归的应用——归并排序
 * 
 * @author Wyran
 *
 */
public class MergeSort {
	@Test
	public void mergeSortTest() {
		int[] arr = { 1, 8, 9, 6, 4, 3, 9, 15, -1 };
		int[] result = mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(result));
	}
	
	/**
	 * 归并排序递归部分
	 * 
	 * @param arr 待排序数组
	 * @param left 开始排序的下标
	 * @param right 结束排序的下标
	 * @return 排序好的数组
	 */
	public int[] mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);// 合并
		}
		return arr;
	}
	
	/**
	 * 归并排序合并部分
	 * 
	 * @param arr 待排序数组
	 * @param left 左数组的开始下标
	 * @param mid 左数组的结束下标
	 * @param right 右数组的结束下标
	 */
	public void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left;// 左数组的开始下标
		int j = mid + 1;// 右数组的开始下标
		int num = 0;
		while (i <= mid && j <= right) {
			if (arr[i] < arr[j]) {
				temp[num++] = arr[i++];
			} else {
				temp[num++] = arr[j++];
			}
		}
		while (i <= mid) {
			temp[num++] = arr[i++];
		}
		while (j <= right) {
			temp[num++] = arr[j++];
		}

		for (int k = 0; k < temp.length; k++) {
			arr[k + left] = temp[k];
		}
	}
}
