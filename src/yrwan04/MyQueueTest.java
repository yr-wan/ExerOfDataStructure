package yrwan04;

public class MyQueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(4);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		System.out.println("isFull?" + queue.isFull());
		System.out.println("peek:" + queue.peek());
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
		System.out.println("isEmpty?" + queue.isEmpty());
		System.out.println();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}
}
