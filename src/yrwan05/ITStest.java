package yrwan05;

import java.util.Scanner;

public class ITStest {
	public static void main(String[] args) {
		CharStack result;
		System.out.print("输入中缀表达式:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		result =InfixToSuffix.change(input);// 转为后缀表达式
		System.out.print("\n转换后的后缀表达式为:");
		result.display();
		System.out.println("-----------------------------------");
		result = InfixToPrefix.change(input);// 转为前缀表达式
		System.out.print("\n转换后的前缀表达式为:");
		result.display();
		sc.close();
	}
}
