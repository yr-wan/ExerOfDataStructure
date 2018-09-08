package yrwan06;

public class HeadTailLinkedListTest {
	public static void main(String[] args) {
		HeadTailLinkedList htll = new HeadTailLinkedList();
		htll.insertHead(1);
		htll.insertHead(2);
		htll.insertHead(3);
		htll.insertTail(4);
		htll.insertTail(5);
		htll.insertTail(6);
		htll.display();
		System.out.println("-------------");
		htll.deleteHead();
		htll.display();
		System.out.println("-------------");
		htll.find(4).display();
		System.out.println("-------------");
		htll.delete(5).display();
		System.out.println("-------------");
		htll.display();
	}
}
