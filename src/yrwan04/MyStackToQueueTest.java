package yrwan04;

import org.junit.Test;

public class MyStackToQueueTest {

	@Test
	public void test() {
		MyStackToQueue mstq = new MyStackToQueue();
		mstq.insert('A');
		System.out.print(mstq.remove());
		System.out.println();
		mstq.insert('B');
		mstq.insert('C');
		mstq.insert('D');
		System.out.println(mstq.peek());
		System.out.print(mstq.remove());
		System.out.print(mstq.remove());
		System.out.print(mstq.remove());
	}

}
