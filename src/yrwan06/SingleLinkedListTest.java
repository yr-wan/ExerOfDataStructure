package yrwan06;

public class SingleLinkedListTest {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertHead(27);
		sll.insertHead(34);
		sll.insertHead(32);
		sll.insertHead(33);
		sll.insertHead(31);
		sll.insertHead(84);
		sll.display();
		System.out.println("-------------");
		sll.deleteHead();
		sll.display();
		System.out.println("-------------");
		sll.find(34).display();
		System.out.println("-------------");
		sll.delete(34).display();
		System.out.println("-------------");
		sll.display();
	}
}
