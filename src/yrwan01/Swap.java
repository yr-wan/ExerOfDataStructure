package yrwan01;

public class Swap {
	/**
	 * 交换arr数组中a与b的值，使用异或进行交换
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
