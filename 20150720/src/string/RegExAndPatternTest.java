package string;
import java.util.regex.Pattern;


public class RegExAndPatternTest {
	
	public static void main(String[] args) {
		
		// ��ȭ��ȣ�� ���� �Ǵ� �޴����� ��츸 OK
		// 02-502-3325	=> OK
		// 010-2421-1241	=> OK
		// 051-311-3131	=> NOT OK
		String regEx = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "02-234-5678";
		boolean result = Pattern.matches(regEx, data);
		if (result) {
			System.out.println("���Խİ� ��ġ");
		} else {
			System.out.println("���Խİ� ����ġ");
		}
		
		// �̸��� ���� ����
		regEx = "\\w+@\\w+\\.\\w+(\\.\\w+)*";
		data = "angel@navercom";
		result = Pattern.matches(regEx, data);
		if (result) {
			System.out.println("�ùٸ� �̸���");
		} else {
			System.out.println("�̸����� �ٸ��� �Է��ϼ���!");
		}
	}
	
}






















