package exception;

import java.util.Scanner;

/* 1 ~ 10 ������ �߻����Ѽ� ������ ����, �� ���ڸ� ���ߴ� ���� */
public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random() * 10 + 1);
		int input = 0;	// ������� �Է��� ������ ����
		
		while (true) {
			System.out.print("1 ~ 10 ������ ������ �Է��ϼ���: ");
			try {
				input = Integer.parseInt(sc.nextLine());
				if (answer < input) {
					System.out.println("�� ���� ���� �Է��ϼ���.");
				} else if (answer > input) {
					System.out.println("�� ū ���� �Է��ϼ���.");
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("�߸��Է�!!! �ٽ�!!!");
			}
		}
		
		sc.close();
	}
}
