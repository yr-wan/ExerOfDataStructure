package yrwan02;

public class BubbleSort {
	/**
	 * ð������ �Ӻ���ǰð��
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {// ��i�֣�iǰ��Ԫ�����ź�
			boolean flag = true;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[i]) {
					Swap.swap(arr, j, i);
				}
				flag = false;
			}
			if (flag) {
				break;// ĳһ��û�н���������ζ�����ź�˳��
			}
		}
	}
}
