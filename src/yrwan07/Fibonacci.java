package yrwan07;

import org.junit.Test;

/**
 * �ݹ��Ӧ�á���쳲���������
 * 
 * @author Wyran
 *
 */
public class Fibonacci {
	@Test
	public void FibonacciTest(){
		System.out.println(getNumber(5));
	}
	public int getNumber(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return getNumber(n - 1) + getNumber(n - 2);
		}
	}
}
