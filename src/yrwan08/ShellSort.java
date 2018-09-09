package yrwan08;

public class ShellSort {
	/**
	 * 希尔排序:将数组按增量分组，对每组插入排序，减少增量，再插入排序。
	 * 
	 * @param arr
	 */
	public static void shellSort(int[] arr) {
		// 步长初始为1，利用h=3*h+1 式循环，最大间隔为不大于数组的最大值
		int step = 1;// 间隔步长
		while (step < arr.length / 3) {
			step = 3 * step + 1;
		}
		// 按步长进行插入排序
		while (step > 0) {
			for (int i = step; i < arr.length; i++) {
				int temp = arr[i];
				int j = i;
				while (j > step - 1 && arr[j - step] > temp) {
					arr[j] = arr[j - step];
					j -= step;
				}
				arr[j] = temp;
			}
			// 通过h=(h-1)/3 式减少间隔
			step = (step - 1) / 3;
		}
	}
}
