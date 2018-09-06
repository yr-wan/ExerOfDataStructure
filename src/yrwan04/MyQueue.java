package yrwan04;

public class MyQueue {
	private int[] arr;// 队列的底层实现是一个数组
	private int elements;// 实际元素个数
	private int front;// 队头
	private int rear;// 队尾

	// 默认构造一个长度为10的队列
	public MyQueue() {
		arr = new int[10];
		elements = 0;
		front = 0;
		rear = -1;
	}

	// 构造一个长度为size的队列
	public MyQueue(int size) {
		arr = new int[size];
		elements = 0;
		front = 0;
		rear = -1;
	}

	// 新增数据
	public void insert(int value) {
		if (!isFull()) {
			// 如果队尾指向顶了，那么循环回来，执行队列的第一个元素
			if (rear == arr.length - 1) {
				rear = -1;
			}
			elements++;
			arr[++rear] = value;// 队尾加1，然后在队尾处插入新的数据
		}
	}

	// 移除数据
	public int remove() {
		int value = arr[front++];
		if (front == arr.length) {
			front = 0;
		}
		elements--;
		return value;
	}

	// 查看队头数据
	public int peek() {
		return arr[front];
	}

	// 判断是否为空列
	public boolean isEmpty() {
		return elements == 0;
	}

	// 判断是否为满列
	public boolean isFull() {
		return elements == arr.length;
	}
}
