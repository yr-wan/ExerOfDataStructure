package yrwan07;

import org.junit.Test;

/**
 * �ݹ��Ӧ�á������ַ������������в���
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
	 * @param arr ��������
	 * @param target ������ֵ
	 * @param left ������С�±�
	 * @param right ��������±�
	 * @return ����ֵ���±�
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
