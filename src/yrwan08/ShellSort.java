package yrwan08;

public class ShellSort {
	/**
	 * ϣ������:�����鰴�������飬��ÿ��������򣬼����������ٲ�������
	 * 
	 * @param arr
	 */
	public static void shellSort(int[] arr) {
		// ������ʼΪ1������h=3*h+1 ʽѭ���������Ϊ��������������ֵ
		int step = 1;// �������
		while (step < arr.length / 3) {
			step = 3 * step + 1;
		}
		// ���������в�������
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
			// ͨ��h=(h-1)/3 ʽ���ټ��
			step = (step - 1) / 3;
		}
	}
}
