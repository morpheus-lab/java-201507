package exception;

import java.util.Scanner;

public class ExceptionTest {
	
	public void m(int i) {
		int j = 99 / i;	// i가 0인 경우 ArithmeticException 발생 가능
		System.out.println("99를 " + i + "로 나눈 몫은 " + j + "입니다.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 키보드 입력
		
		System.out.println("99를 나눌 수를 입력하세요");
		
		String userInput = sc.nextLine();
		
		try {
			int i = Integer.parseInt(userInput);	// NumberFormatException
			System.out.println("A");
			ExceptionTest t = new ExceptionTest();
			t.m(i);	// i가 0인 경우 ArithmeticException 발생 가능
			System.out.println("B");
		} catch(ArithmeticException e) {
			// e 처리
			System.out.println("산술연산 중 예외가 발생했습니다.");
		} catch (NumberFormatException e) {
			// 예외 처리
			System.out.println("숫자만 입력 가능합니다!");
		} catch(RuntimeException e) {
			System.out.println("런타임 예외 발생!!!");
		}
		
		System.out.println("main 메소드 끝!");
		
		
	}
	
}
