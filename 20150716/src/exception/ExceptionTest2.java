package exception;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		
		// ���� �߻��� �� �ִ� ����
		
		// ArithmeticException => ��� ������ ������ �� ���� ��
		
		// NumberFormatException => ���ڰ� �ƴ� ���ڿ��� ���ڷ� ��ȯ�� ��
		
		// NullPointerException
//		String s = null;
//		int l = s.length();
//		System.out.println("����: " + l);
		
		// OutOfMemoryError	=> JVM�� ����� �� �ִ� �޸𸮸� �Ѿ��
		//					   ����Ϸ��� ���
		
		// ArrayIndexOutOfBoundsException
		int[] intArr = new int[5];
		for (int i = 0; i < 5; i++) {
			intArr[i + 1] = intArr[i] + i + 1;
			System.out.println("intArr[" + (i + 1) + "] = " + intArr[i + 1]);
		}
		// intArr[0] = 0
		// intArr[1] = 0 + 0 + 1 = 1;	// i == 0 �� ��
		// intArr[2] = 1 + 1 + 1 = 3;	// i == 1 �� ��
		// intArr[3] = 3 + 2 + 1 = 6;	// i == 2 �� ��
		// intArr[4] = 6 + 3 + 1 = 10;	// i == 3 �� ��
		// intArr[5] = 10 + 4 + 1 = 15; // i == 4 �� ��
		//		=> ArrayIndexOutOfBoundsException �߻�
		
		
		
		
		
		
		
	}
	
}
