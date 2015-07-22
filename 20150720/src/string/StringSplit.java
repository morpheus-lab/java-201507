package string;
import java.util.regex.Pattern;


public class StringSplit {
	
	public static void main(String[] args) {
		
		String text = "안녕하세요, Java 123 세계에 오신 것을 환영합니다! "
				+ "재밌는 프로그램을 만들어봅시다!";
		
		String regEx = "[0-9]+";
		
		String[] fields = text.split(regEx);
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		
	}
	
}






















