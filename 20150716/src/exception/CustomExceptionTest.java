package exception;

import java.util.Scanner;

class LesserThanTwoException extends Exception {
	// 2 미만의 데이터임을 알리는 데 사용되는 예외 클래스
	
	public LesserThanTwoException() {}
	public LesserThanTwoException(String message) {
		super(message);
	}
}

public class CustomExceptionTest {
	
	public static int squareOf(int a) throws LesserThanTwoException {
		if (a < 2) {
			throw new LesserThanTwoException();
		}
		return (int) Math.pow(a, 2);	// 제곱
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요: ");
		System.out.print("2 이상의 정수를 입력하세요: ");
		int i = Integer.parseInt(sc.nextLine());
		try {
			int sq = squareOf(i);
			System.out.printf("%d의 제곱은 %d입니다.", i, sq);
		} catch (LesserThanTwoException e) {
			System.out.println("2보다 작은 수를 입력했습니다.");
		} finally {
			sc.close();
		}
	}
	
}
