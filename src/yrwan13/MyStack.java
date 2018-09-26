package yrwan13;

public class MyStack {
	private int[] arr;// 栈的底层实现是一个数组
	private int top;// 栈顶

	// 默认构造一个长度为10的栈
	public MyStack() {
		arr = new int[10];
		top = -1;
	}

	// 构造一个长度为size的栈
	public MyStack(int size) {
		arr = new int[size];
		top = -1;
	}

	// 压栈
	public void push(int value) {
		if (!isFull()) {
			arr[++top] = value;
		}
	}

	// 弹栈
	public int pop() {
		return arr[top--];
	}

	// 查看栈顶
	public int peek() {
		return arr[top];
	}

	// 判断是否为空栈
	public boolean isEmpty() {
		return top == -1;
	}

	// 判断是否为满栈
	public boolean isFull() {
		return top == arr.length - 1;
	}
}
