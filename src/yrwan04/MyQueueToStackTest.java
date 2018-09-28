package yrwan04;

import org.junit.Test;

public class MyQueueToStackTest {

	@Test
	public void test() {
		MyQueueToStack mqts = new MyQueueToStack();
		mqts.push('A');
		System.out.print(mqts.pop());
		System.out.println();
		mqts.push('B');
		mqts.push('C');
		mqts.push('D');
		System.out.println(mqts.peek());
		System.out.print(mqts.pop());
		System.out.print(mqts.pop());
		System.out.print(mqts.pop());
	}

}
