package yrwan04;

import java.util.LinkedList;
import java.util.Queue;

//����������ʵ��ջ
public class MyQueueToStack {
	Queue<Character> q1 = new LinkedList<>();
	Queue<Character> q2 = new LinkedList<>();// pushʱ���ݴ����

	public void push(char c) {
		while (!q1.isEmpty()) {// ��q1��Ԫ���ƶ���q2
			q2.offer(q1.poll());
		}
		q1.offer(c);// ���Ԫ��
		while (!q2.isEmpty()) {// ���ƻ���
			q1.offer(q2.poll());
		}
	}

	public Character pop() {
		return q1.poll();
	}

	public Character peek() {
		return q1.peek();
	}
}
