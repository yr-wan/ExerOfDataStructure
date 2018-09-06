package yrwan02;

public class SelectSort {
	/**
	 * �Ľ���ѡ������ ����һ������minIndex�洢��СԪ�ص������±�
	 * 
	 * @param arr
	 */
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {// ��i�֣�iǰ��Ԫ�����ź�
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				Swap.swap(arr, minIndex, i);// ���minIndex�����仯������н���
			}
		}
	}
}
