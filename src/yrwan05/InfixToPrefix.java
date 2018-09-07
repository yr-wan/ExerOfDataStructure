package yrwan05;

public class InfixToPrefix {

	/**
	 * 将中缀表达式转为前缀表达式
	 * 
	 * @param in传入中缀表达式
	 * @return 前缀表达式
	 */
	public static CharStack change(String in) {
		CharStack s1 = new CharStack(in.length());// 操作符栈
		CharStack s2 = new CharStack(in.length());// 操作数栈
		// 开始判断
		for (int i = in.length() - 1; i >= 0; i--) {
			System.out.print("s1栈元素为(栈底--->栈顶):");
			s1.display();
			System.out.print("s2栈元素为(栈底--->栈顶):");
			s2.display();
			char ch = in.charAt(i);
			System.out.println("当前待判断的字符:" + ch);
			if ((ch <= '9' && ch >= '0') || (ch <= 'z' && ch >= 'a')) {// 遇到数压入s2
				s2.push(ch);
			} else if (ch == ')') {// 遇到右括号，直接压入s1
				s1.push(ch);
			} else if (ch == '(') {// 遇到左括号，将s1弹出并压入s2，直至s1遇到右括号，并舍弃这对括号
				char temp;
				while ((temp = s1.pop()) != ')') {
					s2.push(temp);
				}
			} else {// 遇到运算符
				// 若s1非空 并且 s1的栈顶不是")" 并且 ch优先级小于s1的栈顶
				while (!s1.isEmpty() && s1.peek() != ')' && compare(s1.peek(), ch)) {
					s2.push(s1.pop());// 将s1弹到s2，直至满足下方条件
				}
				// 若s1为空 或 s1的栈顶是")" 或 ch优先级大于等于s1的栈顶
				s1.push(ch);
			}
		}
		// 中缀表达式遍历完成，将s1剩余的元素弹到s2
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return s1;
	}

	/**
	 * 比较两运算符优先级
	 * 
	 * @param a传入待比较
	 * @param b传入栈顶
	 * @return true是a大，false是a小或相等
	 */
	public static boolean compare(char a, char b) {
		if ((a == '*' || a == '/') && (b != '*' || b != '/')) {
			return true;
		} else {
			return false;
		}
	}
}
