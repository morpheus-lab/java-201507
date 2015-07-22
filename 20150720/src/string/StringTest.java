package string;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		/*
		String s1 = "Helloworld";
		String s2 = "WordHallo";
		System.out.println(
				s1.regionMatches(false, 5, s2, 0, 3));
		
		String s = "�ڹ�";
		byte[] bytes = s.getBytes();	// �ý��� �⺻ ���� ���ڵ� ����� ����
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		String str = new String(bytes);
		System.out.println("���ڵ� ����: " + str);
		
		// utf-8
		try {
			bytes = s.getBytes("UTF-8");
			for (int i = 0; i < bytes.length; i++) {
				System.out.printf("%x\n", bytes[i]);
			}
			str = new String(bytes, "UTF-8");
			System.out.println("���ڵ� ����: " + str);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// String replace(char o, char n)
		String oldStr = "java & jvm";
		String newStr = oldStr.replace('j', 'k');
		System.out.println(newStr);
		
		// String replace(CharSequence o, CharSequence n)
		String oldStr = "java & jvm available";
		String newStr = oldStr.replace("va", "bz");
		System.out.println(newStr);
		
		// substring
		System.out.println("\"" + oldStr.substring(3, 7) + "\"");
		System.out.println("\"" + oldStr.substring(10) + "\"");
		
		// trim() : ���ڿ� �յ� ���鹮��(��, �ٹٲ�, �����̽�) ����
		String s = "    java  programming  \t\r\n               ";
		String str = s.trim();
		System.out.println("s  : [" + s + "]");
		System.out.println("str: [" + str + "]");
		
		// toUpperCase() / toLowerCase()
		String upperCaseStr = str.toUpperCase();
		System.out.println("[" + upperCaseStr + "]");
		
		String lowerCaseStr = upperCaseStr.toLowerCase();
		System.out.println("toLowerCase: [" + lowerCaseStr + "]");
		
		// startsWith(String prefix)
		System.out.println("startsWith: " + lowerCaseStr.startsWith("jav"));
		System.out.println("startsWith: " + lowerCaseStr.startsWith("av"));
		
		// endsWith(String suffix)
		String lowerCaseStr = "java programming";
		System.out.println("endsWith: " + lowerCaseStr.endsWith("ing"));
		System.out.println("endsWith: " + lowerCaseStr.endsWith("ling"));
		
		// int indexOf(String s)
		int i = "hey what the f***, f***".indexOf("f***");
		System.out.println(i);
		
		System.out.println("-------------------------------");
		 */
		// static String valueOf(...)
		boolean b = true;
		System.out.println(String.valueOf(b)); // b�� true�̸� "true" / false��� "false"
		
		char c = 'a';
//		System.out.println(c.hashCode());
		System.out.println(String.valueOf(c).hashCode());
		
		char[] cArr = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(String.valueOf(cArr));
		System.out.println(String.valueOf(cArr, 1, 3));	// cArr�� 1�� �ε��� ���ں��� 3�� ����
		
		/*
		// static String valueOf(Object o)
		// o�� null�̸� "null" ����
		//     �ƴϸ� o.toString() ����
		*/
		
		String s = "java & jvm available";
		System.out.println(s.indexOf("av"));
		System.out.println(s.lastIndexOf("av"));
	}
}
























