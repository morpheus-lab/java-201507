package exception;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 (2 이상)");
		int i = Integer.parseInt(sc.nextLine());
		try {
			if (i < 2) {
				throw new Exception();	// 강제로 예외 발생시킴
			}
		} catch(Exception e) {
			System.out.println("2 이상의 정수만 입력 바람!");
		}
		
		sc.close();
		
	}
	
}
