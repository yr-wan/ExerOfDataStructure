package yrwan03;

import org.junit.Test;

public class testStringReverse {
	// 使用栈进行字符串反转
	@Test
	public void testStringReversal() {
		MyStack stack = new MyStack(20);
		String str = "HelloWorld";
		char[] cha = str.toCharArray();
		for (char c : cha) {
			stack.push(c);
		}
		while (!stack.isEmpty()) {
			System.out.print((char) stack.pop());
		}
	}
}
