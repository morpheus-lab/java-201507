import java.util.Scanner;

public class Money {
	
	final static int ������ = 50000;
	final static int ���� = 10000;
	final static int ��õ�� = 5000;
	final static int õ�� = 1000;
	final static int ����� = 500;
	final static int ��� = 100;
	final static int ���ʿ� = 50;
	final static int �ʿ� = 10;
	final static int ���� = 5;
	final static int �Ͽ� = 1;
	
	public static void main(String[] args) {
		int money = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���.");
		money = sc.nextInt();
		sc.close();	// ��ĳ�� �ڿ� (Ű���� �Է�) �ݳ�
		
		count = money / ������;	// ���������� �� �� �ʿ�?
		if (count > 0)
			System.out.println("�������� " + count + "��");
		money = money % ������;	// ������ �ݾ��� ���ο� money ������
//		money %= ������;
		
		count = money / ����;	// �������� �� �� �ʿ�?
		if (count > 0)
			System.out.println("������ " + count + "��");
		money %= ����;	// ������ �ݾ��� ���ο� money ������
		
		count = money / ��õ��;	// ��õ������ �� �� �ʿ�?
		if (count > 0)
			System.out.println("��õ���� " + count + "��");
		money %= ��õ��;	// ������ �ݾ��� ���ο� money ������
		
		count = money / õ��;	// õ������ �� �� �ʿ�?
		if (count > 0)
			System.out.println("õ���� " + count + "��");
		money %= õ��;	// ������ �ݾ��� ���ο� money ������
		
		count = money / �����;	// ����� ������ �� �� �ʿ�?
		if (count > 0)
			System.out.println("����� " + count + "��");
		money %= �����;	// ������ �ݾ��� ���ο� money ������
		
		count = money / ���;	// ��� ������ �� �� �ʿ�?
		if (count > 0)
			System.out.println("��� " + count + "��");
		money %= ���;	// ������ �ݾ��� ���ο� money ������
		
		count = money / ���ʿ�;	// ���ʿ� ������ �� �� �ʿ�?
		if (count > 0)
			System.out.println("���ʿ� " + count + "��");
		money %= ���ʿ�;	// ������ �ݾ��� ���ο� money ������
		
		count = money / �ʿ�;	// �ʿ� ������ �� �� �ʿ�?
		if (count > 0)
			System.out.println("�ʿ� " + count + "��");
		money %= �ʿ�;	// ������ �ݾ��� ���ο� money ������
		
		count = money / ����;	// ���� ������ �� �� �ʿ�?
		if (count > 0)
			System.out.println("���� " + count + "��");
		money %= ����;	// ������ �ݾ��� ���ο� money ������
		
		if (money > 0) {
			System.out.println("�Ͽ� " + money + "��");
		}
		
		
	}
	
}









