package string;

public class StringToInteger {
	
	public static void main(String[] args) {
		/*
		// String -> Integer
		Integer i = new Integer("123");
		System.out.println(i + 0);	// i�� ���ڿ��̾��ٸ�
									// 1230 ��� ���
		
		i = Integer.valueOf("156");
		System.out.println(i + 0);
		
		i = Integer.valueOf("11010101001", 2);
		System.out.println(i + 0);
		*/
		// Integer -> String
		String s = Integer.toString(1234);
		System.out.println(0 + s);
		
		s = Integer.toString(1234, 16);
		System.out.println(s);
		
		s = String.valueOf(345);
		System.out.println(0 + s);
	}
	
}
