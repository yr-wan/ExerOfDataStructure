package yrwan03;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("isFull?" + stack.isFull());
		System.out.println("peek:" + stack.peek());
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("isEmpty?" + stack.isEmpty());
	}
}
