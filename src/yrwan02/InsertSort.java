package yrwan02;

public class InsertSort {
	/**
	 * ��������:ÿһ�ν�һ���������Ԫ�أ����뵽ǰ���Ѿ��ź��������������ȥ��ֱ����������Ԫ��Ϊֹ��
	 * 
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {// ��i�֣�iǰ��Ԫ�����ź�
			int temp = arr[i];// �ݴ��i��Ԫ��
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {// ��j-1��Ԫ��������temp�Ƚ�, �� temp�������
				arr[j] = arr[j - 1];// ����
				j--;
			}
			arr[j] = temp;
		}
	}
}
