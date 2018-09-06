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
		// 显示数组元素
		array.display();
		// 根据下标为0的元素
		System.out.println("下标为0的元素：" + array.get(0));
		// 删除4的元素
		array.delete(4);
		// 将元素3修改为33
		array.modify(3, 30);
		array.display();
	}
}
