package string;
import java.util.regex.Pattern;


public class StringSplit {
	
	public static void main(String[] args) {
		
		String text = "�ȳ��ϼ���, Java 123 ���迡 ���� ���� ȯ���մϴ�! "
				+ "��մ� ���α׷��� �����ô�!";
		
		String regEx = "[0-9]+";
		
		String[] fields = text.split(regEx);
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		
	}
	
}






















