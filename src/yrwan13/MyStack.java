package yrwan13;

public class MyStack {
	private int[] arr;// ջ�ĵײ�ʵ����һ������
	private int top;// ջ��

	// Ĭ�Ϲ���һ������Ϊ10��ջ
	public MyStack() {
		arr = new int[10];
		top = -1;
	}

	// ����һ������Ϊsize��ջ
	public MyStack(int size) {
		arr = new int[size];
		top = -1;
	}

	// ѹջ
	public void push(int value) {
		if (!isFull()) {
			arr[++top] = value;
		}
	}

	// ��ջ
	public int pop() {
		return arr[top--];
	}

	// �鿴ջ��
	public int peek() {
		return arr[top];
	}

	// �ж��Ƿ�Ϊ��ջ
	public boolean isEmpty() {
		return top == -1;
	}

	// �ж��Ƿ�Ϊ��ջ
	public boolean isFull() {
		return top == arr.length - 1;
	}
}
