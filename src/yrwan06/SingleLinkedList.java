package yrwan06;

/**
 * 单向链表，只能在表头插入
 * 
 * @author Wyran
 *
 */
public class SingleLinkedList {
	private int size;
	private Node head;

	public SingleLinkedList() {
		size = 0;
		head = null;
	}

	/**
	 * 在表头添加元素
	 * 
	 * @param value待插入元素
	 */
	public void insertHead(int value) {
		Node newHead = new Node(value);
		newHead.next = head;
		head = newHead;
		size++;
	}

	/**
	 * 删除表头
	 * 
	 * @return 返回的表头
	 */
	public Node deleteHead() {
		Node temp = head;
		head = head.next;
		size--;
		return temp;
	}

	/**
	 * 根据传入的值删除结点
	 * 
	 * @param value待删除的值
	 * @return 返回已删除的结点
	 */
	public Node delete(int value) {
		Node current = head;
		Node previous = head;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		// 如果删除的结点是第一个结点
		if (current == head) {
			head = head.next;
		} else {// 删除的结点不是第一个结点
			previous.next = current.next;
		}
		size--;
		return current;
	}

	/**
	 * 查找指定元素
	 * 
	 * @param value待查找元素
	 * @return 找到了返回该结点，找不到返回null
	 */
	public Node find(int value) {
		Node current = head;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	// 判断链表是否为空
	public boolean isEmpty() {
		return (size == 0);
	}

	// 遍历显示
	public void display() {
		Node temp = head;
		while (temp != null) {
			temp.display();
			temp = temp.next;
		}
	}
}
