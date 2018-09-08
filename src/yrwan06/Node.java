package yrwan06;

public class Node {
	public int data;// 数据域
	public Node next;// 指针域:指向下一个结点
	public Node prev;// 指针域:指向前一个结点

	public Node(int data) {
		this.data = data;
	}
	
	public void display(){
		System.out.print(data + " ");
	}
}
