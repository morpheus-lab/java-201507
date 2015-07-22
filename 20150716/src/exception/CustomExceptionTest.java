package exception;

import java.util.Scanner;

class LesserThanTwoException extends Exception {
	// 2 �̸��� ���������� �˸��� �� ���Ǵ� ���� Ŭ����
	
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
		return (int) Math.pow(a, 2);	// ����
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���: ");
		System.out.print("2 �̻��� ������ �Է��ϼ���: ");
		int i = Integer.parseInt(sc.nextLine());
		try {
			int sq = squareOf(i);
			System.out.printf("%d�� ������ %d�Դϴ�.", i, sq);
		} catch (LesserThanTwoException e) {
			System.out.println("2���� ���� ���� �Է��߽��ϴ�.");
		} finally {
			sc.close();
		}
	}
	
}
