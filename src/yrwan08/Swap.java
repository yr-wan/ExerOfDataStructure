package yrwan08;

public class Swap {
	/**
	 * 
	 * @param arr
	 * @param a
	 * @param b
	 */
	public static void swap(int[] arr, int a, int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

//  // 利用异或不可交换相同数据！
//	public static void swap(int[] arr, int a, int b) {
//		arr[a] ^= arr[b];
//		arr[b] ^= arr[a];
//		arr[a] ^= arr[b];
//	}
}
