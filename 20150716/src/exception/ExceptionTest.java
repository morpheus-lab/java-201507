package exception;

import java.util.Scanner;

public class ExceptionTest {
	
	public void m(int i) {
		int j = 99 / i;	// i�� 0�� ��� ArithmeticException �߻� ����
		System.out.println("99�� " + i + "�� ���� ���� " + j + "�Դϴ�.");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// Ű���� �Է�
		
		System.out.println("99�� ���� ���� �Է��ϼ���");
		
		String userInput = sc.nextLine();
		
		try {
			int i = Integer.parseInt(userInput);	// NumberFormatException
			System.out.println("A");
			ExceptionTest t = new ExceptionTest();
			t.m(i);	// i�� 0�� ��� ArithmeticException �߻� ����
			System.out.println("B");
		} catch(ArithmeticException e) {
			// e ó��
			System.out.println("������� �� ���ܰ� �߻��߽��ϴ�.");
		} catch (NumberFormatException e) {
			// ���� ó��
			System.out.println("���ڸ� �Է� �����մϴ�!");
		} catch(RuntimeException e) {
			System.out.println("��Ÿ�� ���� �߻�!!!");
		}
		
		System.out.println("main �޼ҵ� ��!");
		
		
	}
	
}
