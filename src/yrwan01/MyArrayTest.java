package yrwan01;

import org.junit.Test;

public class MyArrayTest {
	@Test
	public void myArrayTest() {
		MyArray array = new MyArray(4);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		// ��ʾ����Ԫ��
		array.display();
		// �����±�Ϊ0��Ԫ��
		System.out.println("�±�Ϊ0��Ԫ�أ�" + array.get(0));
		// ɾ��4��Ԫ��
		array.delete(4);
		// ��Ԫ��3�޸�Ϊ33
		array.modify(3, 30);
		array.display();
	}
}
