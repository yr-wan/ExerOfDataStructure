package yrwan04;

import java.util.LinkedList;
import java.util.Queue;

//用两个队列实现栈
public class MyQueueToStack {
	Queue<Character> q1 = new LinkedList<>();
	Queue<Character> q2 = new LinkedList<>();// push时是暂存队列

	public void push(char c) {
		while (!q1.isEmpty()) {// 把q1的元素移动到q2
			q2.offer(q1.poll());
		}
		q1.offer(c);// 添加元素
		while (!q2.isEmpty()) {// 再移回来
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
