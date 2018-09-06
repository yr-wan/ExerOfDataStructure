package yrwan01;

public class MyArray {
	private int[] arr;// ���������
	private int elems;// �����ʵ�ʳ���
	private int length;// �������󳤶�

	// ���쳤��Ϊ50������
	public MyArray() {
		elems = 0;
		length = 50;
		arr = new int[length];
	}

	// ���쳤��Ϊlength������
	public MyArray(int length) {
		elems = 0;
		this.length = length;
		arr = new int[length];
	}

	// ��������Ԫ�صĸ���
	public int getSize() {
		return elems;
	}

	// ���Ԫ��
	public boolean add(int value) {
		if (elems == length) {
			return false;
		} else {
			arr[elems] = value;
			elems++;
		}
		return true;
	}

	// ����ָ��λ�õ�Ԫ��
	public int get(int index) {
		if (index < 0 || index > elems) {
			return -1;
		}
		return arr[index];
	}

	// ����ָ��Ԫ�ص�λ��
	public int findIndex(int value) {
		int i;
		for (i = 0; i < elems; i++) {
			if (arr[i] == value) {
				break;
			}
		}
		if (i == value) {
			return -1;
		}
		return i;
	}

	// ɾ��ָ��Ԫ��
	public boolean delete(int value) {
		int i = findIndex(value);
		if (i == -1) {
			return false;
		} else {
			if (i == elems) {
				elems--;
			} else {
				for (int j = i; j < elems - 1; j++) {
					arr[j] = arr[j + 1];
				}
				elems--;
			}
			return true;
		}
	}

	// ��oldValue����ΪnewValue
	public boolean modify(int oldValue, int newValue) {
		int i = findIndex(oldValue);
		if (i == -1) {
			return false;
		} else {
			arr[i] = newValue;
			return true;
		}
	}

	// ��������
	public void display() {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
