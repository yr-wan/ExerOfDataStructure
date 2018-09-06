package yrwan02;

public class BubbleSort {
	/**
	 * ð������ ��ѭ���������������������ѭ����ʾÿ�ֲ���Ƚϵ�Ԫ���±꣬����ð��
	 * 
	 * @param arr
	 */
	public static void bubbleSort1(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {// ��i��
			boolean flag = true;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					Swap.swap(arr, j, j + 1);
				}
				flag = false;
			}
			if (flag) {
				break;// ĳһ��û�н���������ζ�����ź�˳��
			}
		}
	}
	/**
	 * ð������ ����ð��
	 * 
	 * @param arr
	 */
	public static void bubbleSort2(int[] arr) {
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
