package yrwan12;

public class TestMyHeap {
	public static void main(String[] args) {
		MyHeap myHeap = new MyHeap(10);
		myHeap.insert(10);
		myHeap.insert(1);
		myHeap.insert(5);
		myHeap.insert(2);
		myHeap.insert(7);
		myHeap.insert(3);
		myHeap.insert(9);
		myHeap.displayHeap();
		myHeap.remove();
		myHeap.displayHeap();
	}
}
