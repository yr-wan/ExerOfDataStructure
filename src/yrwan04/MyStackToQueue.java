package yrwan04;

import java.util.Stack;

// ������ջʵ�ֶ���
public class MyStackToQueue {
	Stack<Character> s1 = new Stack<>();// ��������
	Stack<Character> s2 = new Stack<>();// �������

	public void insert(char c) {
		s1.push(c);
	}

	public Character remove() {
		while (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}

	public Character peek() {
		while (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.peek();
	}
}
