package exception;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� (2 �̻�)");
		int i = Integer.parseInt(sc.nextLine());
		try {
			if (i < 2) {
				throw new Exception();	// ������ ���� �߻���Ŵ
			}
		} catch(Exception e) {
			System.out.println("2 �̻��� ������ �Է� �ٶ�!");
		}
		
		sc.close();
		
	}
	
}
