package yrwan07;

/**
 * 递归的应用——背包问题
 * 
 * @author Wyran
 *
 */
public class Knapsack {
	private int[] weights; // 物品重量
	private boolean[] select;// 物品是否选择
	private boolean flag = false; // 结束递归的判断

	public Knapsack(int[] arr) {
		this.weights = arr;
		select = new boolean[arr.length];
	}

	/**
	 * 
	 * @param target 背包剩余可容纳重量
	 * @param index 尝试放入下标为index的物品
	 */
	public void knapsack(int target, int index) {
		if (flag) {
			return;
		}
		// 如果剩余可容纳为0则说明已成功
		if (target == 0) {
			flag = true;// 结束递归
			for (int i = 0; i < index; i++) {
				if (select[i] == true) {
					System.out.print(weights[i] + " ");
				}
			}
			return;
		}
		// 未找到方法
		if (target < 0 || index >= weights.length) {
			return;
		}
		// 进行递归

		// 尝试放入下标为index的物品
		select[index] = true;
		knapsack(target - weights[index], index + 1);
		// 下标为index的物品不满足则尝试下一个
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
