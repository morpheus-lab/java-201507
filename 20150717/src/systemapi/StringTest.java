package systemapi;

public class StringTest {

	public static void main(String[] args) {
		/*
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2);	// ������ �ٸ�
		System.out.println(s1 == s3);	// ������ ����
		*/
		/*
		String s1 = "abc";
		String s2 = s1;
		
		System.out.println(s1 == s2);
		
		s1 += "def";
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println(s1 == s2);
		*/
		/*
		String s1 = new String("hello");
		String s2 = new String("hello");
//		System.out.println(s1 == s2);	// ������ ���ϱ� ������
										// ���� �� �Ұ�
//		System.out.println(s1.equals(s2));	// ���� ��
		
		s2 = new String("HELLO");
		System.out.println(s1.equalsIgnoreCase(s2));
		*/
		
		// compareTo()
		String s1 = "hello";
		String s2 = "HELLO";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}
	
}












