package yrwan07;

import java.util.Arrays;

import org.junit.Test;

/**
 * �ݹ��Ӧ�á����鲢����
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
	 * �鲢����ݹ鲿��
	 * 
	 * @param arr ����������
	 * @param left ��ʼ������±�
	 * @param right ����������±�
	 * @return ����õ�����
	 */
	public int[] mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);// �ϲ�
		}
		return arr;
	}
	
	/**
	 * �鲢����ϲ�����
	 * 
	 * @param arr ����������
	 * @param left ������Ŀ�ʼ�±�
	 * @param mid ������Ľ����±�
	 * @param right ������Ľ����±�
	 */
	public void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left;// ������Ŀ�ʼ�±�
		int j = mid + 1;// ������Ŀ�ʼ�±�
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
