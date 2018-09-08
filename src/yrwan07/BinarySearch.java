package yrwan07;

import org.junit.Test;

/**
 * 递归的应用——二分法在有序数组中查找
 * 
 * @author Wyran
 *
 */
public class BinarySearch {
	@Test
	public void binarySearchTest() {
		int[] arr = { 10, 11, 12, 16, 18, 23, 29, 33, 48, 54, 57, 68, 77, 84, 98 };
		System.out.println(binarySearch(arr, 23, 0, arr.length - 1));
	}

	/**
	 * 
	 * @param arr 有序数组
	 * @param target 待查找值
	 * @param left 数组最小下标
	 * @param right 数组最大下标
	 * @return 待查值的下标
	 */
	public int binarySearch(int[] arr, int target, int left, int right) {
		int mid = (left + right) / 2;
		if (target == arr[mid]) {
			return mid;
		} else if (left > right) {
			return -1;
		} else {
			if (arr[mid] > target) {
				return binarySearch(arr, target, left, mid - 1);
			}
			if (arr[mid] < target) {
				return binarySearch(arr, target, mid + 1, right);
			}
		}
		return -1;
	}
}
