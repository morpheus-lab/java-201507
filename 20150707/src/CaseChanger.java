import java.io.InputStreamReader;
import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		char c = (char) -1;
		while (true) {
			if (c != '\r' && c != '\n') {
				System.out.println("���ڸ� �Է��ϼ���.");
			}
			// ����ڷκ��� Ű���� �Է��� ����
			c = (char) in.read();
			if (c == '\r' || c == '\n') {
				continue;
			}
			// '0'�� �Է��ߴٸ�, ���α׷� ����
			if (c == '0') {
				break;
			}
			// �Է� ���ڰ� �빮���̸�, �ҹ��ڷ� ��ȯ
			if (c >= 'A' && c <= 'Z') {
//				c += 32;
//				c += 'a' - 'A';
				c |= 32;
			}
			// �Է� ���ڰ� �ҹ����̸�, �빮�ڷ� ��ȯ
			else if (c >= 'a' && c <= 'z') {
//				c -= 32;
				c ^= 32;
			}
			// ���
			System.out.println("��ȯ�� ����: " + c);
		}
		
		in.close();	// �ڿ� ���� (OS�� ��ȯ)
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}





