package yrwan08;

public class QuickSort {
	/**
	 * 快速排序:将数组以基准点划分为两个子数组，再递归调用自身，为子数组进行排序。
	 * 
	 * @param arr
	 */
	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	/**
	 * 
	 * @param arr 待排序数组
	 * @param left 左下标
	 * @param right 右下标
	 */
	public static void sort(int[] arr, int left, int right) {
		if (right <= left) {
			return;// 终止递归
		} else {
			int part = partiton(arr, left, right);// 分组并返回分界点
			sort(arr, left, part - 1);// 排左组
			sort(arr, part + 1, right);// 排右组
		}
	}
	
	/**
	 * 对数组左右分组并返回分界点
	 * 
	 * @param arr 待分组数组
	 * @param left 左下标
	 * @param right 右下标
	 * @return 分界点
	 */
	public static int partiton(int[] arr, int left, int right) {
		int i = left - 1;// 左游标
		int j = right;// 右游标
		int target = arr[right];// 此处以每组最右端元素为分组基准
		
		while (true) {
			while (i < j && arr[++i] < target);
			while (i < j && arr[--j] > target);
			if (i >= j) {// 左右游标相遇时停止
				break;
			} else {
				Swap.swap(arr, i, j);// 左右游标未相遇时停止
			}
		}
		Swap.swap(arr, i, right);// 基与游标相遇时所指的元素交换
		return i;// 返回分界点
	}
}
