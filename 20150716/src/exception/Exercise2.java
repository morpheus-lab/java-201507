package exception;

import java.util.Scanner;

/* 1 ~ 10 난수를 발생시켜서 저장한 다음, 그 숫자를 맞추는 게임 */
public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random() * 10 + 1);
		int input = 0;	// 사용자의 입력을 저장할 변수
		
		while (true) {
			System.out.print("1 ~ 10 사이의 정수를 입력하세요: ");
			try {
				input = Integer.parseInt(sc.nextLine());
				if (answer < input) {
					System.out.println("더 작은 수를 입력하세요.");
				} else if (answer > input) {
					System.out.println("더 큰 수를 입력하세요.");
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("잘못입력!!! 다시!!!");
			}
		}
		
		sc.close();
	}
}
