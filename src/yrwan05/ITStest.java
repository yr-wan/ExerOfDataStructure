package yrwan05;

import java.util.Scanner;

public class ITStest {
	public static void main(String[] args) {
		CharStack result;
		System.out.print("������׺���ʽ:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		result =InfixToSuffix.change(input);// תΪ��׺���ʽ
		System.out.print("\nת����ĺ�׺���ʽΪ:");
		result.display();
		System.out.println("-----------------------------------");
		result = InfixToPrefix.change(input);// תΪǰ׺���ʽ
		System.out.print("\nת�����ǰ׺���ʽΪ:");
		result.display();
		sc.close();
	}
}
