package yrwan07;

/**
 * �ݹ��Ӧ�á�����������
 * 
 * @author Wyran
 *
 */
public class Knapsack {
	private int[] weights; // ��Ʒ����
	private boolean[] select;// ��Ʒ�Ƿ�ѡ��
	private boolean flag = false; // �����ݹ���ж�

	public Knapsack(int[] arr) {
		this.weights = arr;
		select = new boolean[arr.length];
	}

	/**
	 * 
	 * @param target ����ʣ�����������
	 * @param index ���Է����±�Ϊindex����Ʒ
	 */
	public void knapsack(int target, int index) {
		if (flag) {
			return;
		}
		// ���ʣ�������Ϊ0��˵���ѳɹ�
		if (target == 0) {
			flag = true;// �����ݹ�
			for (int i = 0; i < index; i++) {
				if (select[i] == true) {
					System.out.print(weights[i] + " ");
				}
			}
			return;
		}
		// δ�ҵ�����
		if (target < 0 || index >= weights.length) {
			return;
		}
		// ���еݹ�

		// ���Է����±�Ϊindex����Ʒ
		select[index] = true;
		knapsack(target - weights[index], index + 1);
		// �±�Ϊindex����Ʒ������������һ��
		select[index] = false;
		knapsack(target, index + 1);
	}

	public static void main(String[] args) {
		int[] weights = { 11, 9, 7, 6, 5 };
		int target = 20;
		Knapsack knapsack = new Knapsack(weights);
		knapsack.knapsack(target, 0);
	}
}
