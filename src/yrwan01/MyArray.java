package yrwan01;

public class MyArray {
	private int[] arr;// 数组的声明
	private int elems;// 数组的实际长度
	private int length;// 数组的最大长度

	// 构造长度为50的数组
	public MyArray() {
		elems = 0;
		length = 50;
		arr = new int[length];
	}

	// 构造长度为length的数组
	public MyArray(int length) {
		elems = 0;
		this.length = length;
		arr = new int[length];
	}

	// 返回数组元素的个数
	public int getSize() {
		return elems;
	}

	// 添加元素
	public boolean add(int value) {
		if (elems == length) {
			return false;
		} else {
			arr[elems] = value;
			elems++;
		}
		return true;
	}

	// 返回指定位置的元素
	public int get(int index) {
		if (index < 0 || index > elems) {
			return -1;
		}
		return arr[index];
	}

	// 返回指定元素的位置
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

	// 删除指定元素
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

	// 将oldValue更新为newValue
	public boolean modify(int oldValue, int newValue) {
		int i = findIndex(oldValue);
		if (i == -1) {
			return false;
		} else {
			arr[i] = newValue;
			return true;
		}
	}

	// 遍历数组
	public void display() {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
