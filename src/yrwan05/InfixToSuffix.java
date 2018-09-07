package yrwan05;

public class InfixToSuffix {

	/**
	 * ����׺����ʽתΪ��׺����ʽ
	 * 
	 * @param in������׺����ʽ
	 * @return ��׺����ʽ
	 */
	public static CharStack change(String in) {
		CharStack s1 = new CharStack(in.length());// ������ջ
		CharStack s2 = new CharStack(in.length());// ������ջ
		// ��ʼ�ж�
		for (int i = 0; i < in.length(); i++) {
			System.out.print("s1ջԪ��Ϊ(ջ��--->ջ��):");
			s1.display();
			System.out.print("s2ջԪ��Ϊ(ջ��--->ջ��):");
			s2.display();
			char ch = in.charAt(i);
			System.out.println("��ǰ���жϵ��ַ�:" + ch);
			if ((ch <= '9' && ch >= '0') || (ch <= 'z' && ch >= 'a')) {// ������ѹ��s2
				s2.push(ch);
			} else if (ch == '(') {// ���������ţ�ֱ��ѹ��s1
				s1.push(ch);
			} else if (ch == ')') {// ���������ţ���s1������ѹ��s2��ֱ��s1���������ţ��������������
				char temp;
				while ((temp = s1.pop()) != '(') {
					s2.push(temp);
				}
			} else {// ���������
				// ��s1�ǿ� ���� s1��ջ������"(" ���� ch���ȼ�������s1��ջ��
				while (!s1.isEmpty() && s1.peek() != '(' && !compare(ch, s1.peek())) {
					s2.push(s1.pop());// ��s1����s2��ֱ�������·�����
				}
				// ��s1Ϊ�� �� s1��ջ����"(" �� ch���ȼ�����s1��ջ��
				s1.push(ch);
			}
		}
		// ��׺����ʽ������ɣ���s1��Ԫ�ص���s2
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2;
	}

	/**
	 * �Ƚ�����������ȼ�
	 * 
	 * @param a������Ƚ�
	 * @param b����ջ��
	 * @return true��a��false��aС�����
	 */
	public static boolean compare(char a, char b) {
		if ((a == '*' || a == '/') && (b != '*' || b != '/')) {
			return true;
		} else {
			return false;
		}
	}
}