package yrwan06;

public class Node {
	public int data;// ������
	public Node next;// ָ����:ָ����һ�����
	public Node prev;// ָ����:ָ��ǰһ�����

	public Node(int data) {
		this.data = data;
	}
	
	public void display(){
		System.out.print(data + " ");
	}
}
