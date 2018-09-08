package yrwan06;

/**
 * 双端链表，可在表头、表尾插入
 * 
 * @author Wyran
 *
 */
public class HeadTailLinkedList {
	private int size;
	private Node head;
	private Node tail;

	public HeadTailLinkedList() {
		size = 0;
		head = null;
		tail = null;
	}

	/**
	 * 在表头添加元素
	 * 
	 * @param value 待插入元素
	 */
	public void insertHead(int value) {
		Node newHead = new Node(value);
		if (size == 0) {// 如果链表为空，那么头、尾结点都是该新增结点
			head = newHead;
			tail = newHead;
		} else {
			newHead.next = head;
			head = newHead;
		}
		size++;
	}

	/**
	 * 在表尾添加元素
	 * 
	 * @param value 待插入元素
	 */
	public void insertTail(int value) {
		Node newTail = new Node(value);
		if (size == 0) {// 如果链表为空，那么头、尾结点都是该新增结点
			head = newTail;
			tail = newTail;
		} else {
			tail.next = newTail;
			tail = newTail;
		}
		size++;
	}

	/**
	 * 删除表头
	 * 
	 * @return 所删除的结点
	 */
	public Node deleteHead() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
		}
		size--;
		return temp;
	}

	/**
	 * 根据传入的值删除结点
	 * 
	 * @param value 待删除的值
	 * @return 所删除的结点
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
	 * @param value 待查找元素
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
