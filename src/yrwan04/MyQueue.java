package yrwan04;

public class MyQueue {
	private int[] arr;// ���еĵײ�ʵ����һ������
	private int elements;// ʵ��Ԫ�ظ���
	private int front;// ��ͷ
	private int rear;// ��β

	// Ĭ�Ϲ���һ������Ϊ10�Ķ���
	public MyQueue() {
		arr = new int[10];
		elements = 0;
		front = 0;
		rear = -1;
	}

	// ����һ������Ϊsize�Ķ���
	public MyQueue(int size) {
		arr = new int[size];
		elements = 0;
		front = 0;
		rear = -1;
	}

	// ��������
	public void insert(int value) {
		if (!isFull()) {
			// �����βָ���ˣ���ôѭ��������ִ�ж��еĵ�һ��Ԫ��
			if (rear == arr.length - 1) {
				rear = -1;
			}
			elements++;
			arr[++rear] = value;// ��β��1��Ȼ���ڶ�β�������µ�����
		}
	}

	// �Ƴ�����
	public int remove() {
		int value = arr[front++];
		if (front == arr.length) {
			front = 0;
		}
		elements--;
		return value;
	}

	// �鿴��ͷ����
	public int peek() {
		return arr[front];
	}

	// �ж��Ƿ�Ϊ����
	public boolean isEmpty() {
		return elements == 0;
	}

	// �ж��Ƿ�Ϊ����
	public boolean isFull() {
		return elements == arr.length;
	}
}
