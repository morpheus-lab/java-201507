import java.util.Random;
import java.util.Scanner;

public class ShowMeTheNumber {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		// ���� ������ ����
		int ���� = random.nextInt(10);
		
		// ����ڿ��� �����
		System.out.println("0���� 9������ ���� �� �ϳ��� ��󺸼���.");
		
		// ����ڷκ��� �Է� �ޱ�
		Scanner s = new Scanner(System.in);
		int �Է°� = s.nextInt();	// ��ĳ�ʰ� ������ �ϳ� �о� �鿩�� ����
		
		// �´��� �˻�
		if (���� == �Է°�) {
			// true �̸�
			System.out.println("�����Դϴ�~!");
		} else {
			// false �̸�
			System.out.println("��!!! ������ " + ���� + " �Դϴ�.");
		}
		
	}
	
}
