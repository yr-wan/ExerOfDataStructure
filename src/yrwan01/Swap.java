package yrwan01;

public class Swap {
	/**
	 * ����arr������a��b��ֵ��ʹ�������н���
	 * @param arr
	 * @param a
	 * @param b
	 */
	public static void swap(int[] arr, int a, int b){
		arr[a] ^= arr[b];
		arr[b] ^= arr[a];
		arr[a] ^= arr[b];
	}
}
