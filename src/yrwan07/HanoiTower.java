package yrwan07;

import org.junit.Test;

/**
 * 递归的应用——汉诺塔问题
 * 
 * @author Wyran
 *
 */
public class HanoiTower {
	@Test
	public void moveTest(){
		move(3, "A", "B", "C");
	}
	/**
	 * 
	 * @param num 移动的盘子数
	 * @param from 初始塔
	 * @param temp 中间塔
	 * @param to 目标塔
	 */
	public void move(int num, String from, String temp, String to) {
		if (num == 1) {
			System.out.println("将" + num + "号盘从" + from + "移动到" + to);
		} else {
			move(num - 1, from, to, temp);
			System.out.println("将" + num + "号盘从" + from + "移动到" + to);
			move(num - 1, temp, from, to);
		}
	}
}
