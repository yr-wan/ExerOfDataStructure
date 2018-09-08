package yrwan06;

public class DoubleLinkedListTest {
	public static void main(String[] args) {
		DoubleLinkedList dld = new DoubleLinkedList();
		dld.insertHead(1);
		dld.insertHead(2);
		dld.insertHead(3);
		dld.insertTail(4);
		dld.insertTail(5);
		dld.insertTail(6);
		dld.display();
		System.out.println("-------------");

		while (!dld.isEmpty()) {
			dld.deleteHead();
			dld.display();
			System.out.println();
		}

//		while (!dld.isEmpty()) {
//			dld.deleteTail();
//			dld.display();
//			System.out.println();
//		}
	}
}
