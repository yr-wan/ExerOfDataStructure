package yrwan02;

public class Swap {
	/**
	 * ����arr������a��b��ֵ��ʹ�������н���(����Ϊ0)
	 * 
	 * @param arr
	 * @param a
	 * @param b
	 */
	public static void swap(int[] arr, int a, int b) {
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}
	
//  ʹ��temp���н���
//	public static void swap(int[] arr, int a, int b) {
//		int temp;
//		temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//	}
}
