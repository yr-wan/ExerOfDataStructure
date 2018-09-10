package yrwan08;

public class QuickSort {
	/**
	 * ��������:�������Ի�׼�㻮��Ϊ���������飬�ٵݹ��������Ϊ�������������
	 * 
	 * @param arr
	 */
	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	/**
	 * 
	 * @param arr ����������
	 * @param left ���±�
	 * @param right ���±�
	 */
	public static void sort(int[] arr, int left, int right) {
		if (right <= left) {
			return;// ��ֹ�ݹ�
		} else {
			int part = partiton(arr, left, right);// ���鲢���طֽ��
			sort(arr, left, part - 1);// ������
			sort(arr, part + 1, right);// ������
		}
	}
	
	/**
	 * ���������ҷ��鲢���طֽ��
	 * 
	 * @param arr ����������
	 * @param left ���±�
	 * @param right ���±�
	 * @return �ֽ��
	 */
	public static int partiton(int[] arr, int left, int right) {
		int i = left - 1;// ���α�
		int j = right;// ���α�
		int target = arr[right];// �˴���ÿ�����Ҷ�Ԫ��Ϊ�����׼
		
		while (true) {
			while (i < j && arr[++i] < target);
			while (i < j && arr[--j] > target);
			if (i >= j) {// �����α�����ʱֹͣ
				break;
			} else {
				Swap.swap(arr, i, j);// �����α�δ����ʱֹͣ
			}
		}
		Swap.swap(arr, i, right);// �����α�����ʱ��ָ��Ԫ�ؽ���
		return i;// ���طֽ��
	}
}
