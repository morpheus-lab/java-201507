import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�⵵�� �Է��ϼ���.");
		
		int year = scanner.nextInt();	// ����ڰ� �Է��ϴ� ���ڿ���
										// int Ÿ������ �о ��ȯ
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
		
		scanner.close();
		
	}

}
