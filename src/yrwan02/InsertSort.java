package yrwan02;

public class InsertSort {
	/**
	 * 插入排序:每一次将一个待排序的元素，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
	 * 
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {// 第i轮，i前的元素已排好
			int temp = arr[i];// 暂存第i个元素
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {// 第j-1个元素依次与temp比较, 比 temp大就右移
				arr[j] = arr[j - 1];// 右移
				j--;
			}
			arr[j] = temp;
		}
	}
}
