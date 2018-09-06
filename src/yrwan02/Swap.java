package yrwan02;

public class Swap {
	/**
	 * 交换arr数组中a与b的值，使用异或进行交换(不可为0)
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
	
//  使用temp进行交换
//	public static void swap(int[] arr, int a, int b) {
//		int temp;
//		temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//	}
}
