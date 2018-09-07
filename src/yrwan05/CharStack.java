package yrwan05;

/**
 * ���ڴ�����������������ջ
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

	// Ϊ�˱��ں���ֽ�չʾջ�е����ݣ�������һ������ջ�ķ���
	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
