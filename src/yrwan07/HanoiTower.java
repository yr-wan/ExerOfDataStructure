package yrwan07;

import org.junit.Test;

/**
 * �ݹ��Ӧ�á�����ŵ������
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
	 * @param num �ƶ���������
	 * @param from ��ʼ��
	 * @param temp �м���
	 * @param to Ŀ����
	 */
	public void move(int num, String from, String temp, String to) {
		if (num == 1) {
			System.out.println("��" + num + "���̴�" + from + "�ƶ���" + to);
		} else {
			move(num - 1, from, to, temp);
			System.out.println("��" + num + "���̴�" + from + "�ƶ���" + to);
			move(num - 1, temp, from, to);
		}
	}
}
