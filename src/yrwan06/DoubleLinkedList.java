package yrwan06;

/**
 * ˫���������ڱ�ͷ����β����ɾ�����ɴ������������
 * 
 * @author Wyran
 *
 */
public class DoubleLinkedList {
	private int size;
	private Node head;
	private Node tail;

	public DoubleLinkedList() {
		size = 0;
		head = null;
		tail = null;
	}

	/**
	 * �ڱ�ͷ���Ԫ��
	 * 
	 * @param value������Ԫ��
	 */
	public void insertHead(int value) {
		Node newHead = new Node(value);
		if (size == 0) {// �������Ϊ�գ���ôͷ��β��㶼�Ǹ��������
			head = newHead;
			tail = newHead;
		} else {
			head.prev = newHead;
			newHead.next = head;
			head = newHead;
		}
		size++;
	}

	/**
	 * �ڱ�β���Ԫ��
	 * 
	 * @param value������Ԫ��
	 */
	public void insertTail(int value) {
		Node newTail = new Node(value);
		if (size == 0) {// �������Ϊ�գ���ôͷ��β��㶼�Ǹ��������
			head = newTail;
			tail = newTail;
		} else {
			tail.next = newTail;
			newTail.prev = tail;
			tail = newTail;
		}
		size++;
	}

	/**
	 * ɾ����ͷ
	 * 
	 * @return ������ɾ���Ľ��
	 */
	public Node deleteHead() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}
		size--;
		return temp;
	}

	/**
	 * ɾ����β
	 * 
	 * @return ������ɾ���Ľ��
	 */
	public Node deleteTail() {
		Node temp = tail;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
		size--;
		return temp;
	}

	/**
	 * ���ݴ����ֵɾ�����
	 * 
	 * @param value��ɾ����ֵ
	 * @return ������ɾ���Ľ��
	 */
	public Node delete(int value) {
		Node current = head;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		// ���ɾ���Ľ���ǵ�һ�����
		if (current == head) {
			head = head.next;
			head.prev = null;
		} else {// ɾ���Ľ�㲻�ǵ�һ�����
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		size--;
		return current;
	}

	/**
	 * ����ָ��Ԫ��
	 * 
	 * @param value������Ԫ��
	 * @return �ҵ��˷��ظý�㣬�Ҳ�������null
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

	// �ж������Ƿ�Ϊ��
	public boolean isEmpty() {
		return (size == 0);
	}

	// ������ʾ
	public void display() {
		Node temp = head;
		while (temp != null) {
			temp.display();
			temp = temp.next;
		}
	}
}
