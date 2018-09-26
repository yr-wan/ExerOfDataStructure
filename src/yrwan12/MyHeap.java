package yrwan12;

public class MyHeap {
	private Node[] heapArray;// 存储堆的数组
	private int maxSize;// 数组最大容量
	private int currentSize;// 当前存放元素的个数

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

	// 向上调整
	public void trickleUp(int index) {
		int parent = (index - 1) / 2; // 父节点的索引
		Node temp = heapArray[index]; // 将新加的节点存在temp中
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

	// 向下调整
	public void trickleDown(int index) {
		Node temp = heapArray[index];
		int largeChildIndex;
		while (index < currentSize / 2) { // 当该节点至少有一个子节点
			int leftChildIndex = 2 * index + 1;
			int rightChildIndex = 2 * index + 2;
			// 寻找大子节点
			if (rightChildIndex < currentSize && // 右孩子存在？
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