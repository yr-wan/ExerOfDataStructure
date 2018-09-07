package yrwan06;

/**
 * ��������ֻ���ڱ�ͷ����
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
	 * �ڱ�ͷ���Ԫ��
	 * 
	 * @param value������Ԫ��
	 */
	public void insertHead(int value) {
		Node newHead = new Node(value);
		newHead.next = head;
		head = newHead;
		size++;
	}

	/**
	 * ɾ����ͷ
	 * 
	 * @return ���صı�ͷ
	 */
	public Node deleteHead() {
		Node temp = head;
		head = head.next;
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
		Node previous = head;
		while (current.data != value) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		// ���ɾ���Ľ���ǵ�һ�����
		if (current == head) {
			head = head.next;
		} else {// ɾ���Ľ�㲻�ǵ�һ�����
			previous.next = current.next;
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
