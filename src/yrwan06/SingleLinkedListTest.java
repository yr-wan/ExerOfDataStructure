package yrwan06;

public class SingleLinkedListTest {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertHead(1);
		sll.insertHead(2);
		sll.insertHead(3);
		sll.insertHead(4);
		sll.insertHead(5);
		sll.insertHead(6);
		sll.display();
		System.out.println("-------------");
		sll.deleteHead();
		sll.display();
		System.out.println("-------------");
		sll.find(3).display();
		System.out.println("-------------");
		sll.delete(5).display();
		System.out.println("-------------");
		sll.display();
	}
}
