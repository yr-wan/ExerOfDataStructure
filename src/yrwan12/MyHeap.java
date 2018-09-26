package yrwan12;

public class MyHeap {
	private Node[] heapArray;// �洢�ѵ�����
	private int maxSize;// �����������
	private int currentSize;// ��ǰ���Ԫ�صĸ���

	public MyHeap(int maxSize) {
		this.maxSize = maxSize;
		currentSize = 0;
		heapArray = new Node[maxSize];
	}

	public boolean insert(int key) {
		if (isFull()) {
			return false;
		}
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		trickleUp(currentSize);
		currentSize++;
		return true;
	}

	// ���ϵ���
	public void trickleUp(int index) {
		int parent = (index - 1) / 2; // ���ڵ������
		Node temp = heapArray[index]; // ���¼ӵĽڵ����temp��
		while (index > 0 && heapArray[parent].getKey() < temp.getKey()) {
			heapArray[index] = heapArray[parent];
			index = parent;
			parent = (index - 1) / 2;
		}
		heapArray[index] = temp;
	}

	public Node remove() {
		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}

	// ���µ���
	public void trickleDown(int index) {
		Node temp = heapArray[index];
		int largeChildIndex;
		while (index < currentSize / 2) { // ���ýڵ�������һ���ӽڵ�
			int leftChildIndex = 2 * index + 1;
			int rightChildIndex = 2 * index + 2;
			// Ѱ�Ҵ��ӽڵ�
			if (rightChildIndex < currentSize && // �Һ��Ӵ��ڣ�
					heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()) {
				largeChildIndex = rightChildIndex;
			} else {
				largeChildIndex = leftChildIndex;
			}
			if (temp.getKey() >= heapArray[largeChildIndex].getKey()) {
				break;
			}
			heapArray[index] = heapArray[largeChildIndex];
			index = largeChildIndex;
		}
		heapArray[index] = temp;
	}

	public void displayHeap() {
		System.out.println("heapArray: ");
		for (int i = 0; i < currentSize; i++) {
			if (heapArray[i] != null) {
				System.out.print(heapArray[i].getKey() + " ");
			} else {
				System.out.print("--");
			}
		}
	}

	public boolean isEmpty() {
		return (currentSize == 0) ? true : false;
	}

	public boolean isFull() {
		return (currentSize == maxSize) ? true : false;
	}
}

class Node {
	private int data;

	public Node(int key) {
		data = key;
	}

	public int getKey() {
		return data;
	}

	public void setKey(int key) {
		data = key;
	}
}