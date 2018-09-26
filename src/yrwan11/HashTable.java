package yrwan11;

public class HashTable {
	private Info[] arr;

	public HashTable() {
		arr = new Info[100];
	}

	public HashTable(int maxSize) {
		arr = new Info[maxSize];
	}

	public void insert(Info info) {
		arr[info.getKey()] = info;
	}

	public Info find(int key) {
		return arr[key];
	}
}

class Info {
	private int key;
	private int value;

	public Info() {
		super();
	}

	public Info(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}