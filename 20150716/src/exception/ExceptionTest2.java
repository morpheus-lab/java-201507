package exception;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		
		// 자주 발생할 수 있는 예외
		
		// ArithmeticException => 산술 연산을 수행할 수 없을 때
		
		// NumberFormatException => 숫자가 아닌 문자열을 숫자로 변환할 때
		
		// NullPointerException
//		String s = null;
//		int l = s.length();
//		System.out.println("길이: " + l);
		
		// OutOfMemoryError	=> JVM이 사용할 수 있는 메모리를 넘어서서
		//					   사용하려는 경우
		
		// ArrayIndexOutOfBoundsException
		int[] intArr = new int[5];
		for (int i = 0; i < 5; i++) {
			intArr[i + 1] = intArr[i] + i + 1;
			System.out.println("intArr[" + (i + 1) + "] = " + intArr[i + 1]);
		}
		// intArr[0] = 0
		// intArr[1] = 0 + 0 + 1 = 1;	// i == 0 일 때
		// intArr[2] = 1 + 1 + 1 = 3;	// i == 1 일 때
		// intArr[3] = 3 + 2 + 1 = 6;	// i == 2 일 때
		// intArr[4] = 6 + 3 + 1 = 10;	// i == 3 일 때
		// intArr[5] = 10 + 4 + 1 = 15; // i == 4 일 때
		//		=> ArrayIndexOutOfBoundsException 발생
		
		
		
		
		
		
		
	}
	
}
