package yrwan05;

/**
 * 用于存放运算符与运算数的栈
 * 
 * @author Wyran
 *
 */
public class CharStack {
	private char[] arr;
	private int top;

	public CharStack(int size) {
		arr = new char[size];
		top = -1;
	}

	public void push(char c) {
		if (!isFull()) {
			arr[++top] = c;
		}
	}

	public char pop() {
		return arr[top--];
	}

	public char peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

	// 为了便于后面分解展示栈中的内容，增加了一个遍历栈的方法
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
