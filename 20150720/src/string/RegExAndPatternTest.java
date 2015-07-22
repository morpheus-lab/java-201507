package string;
import java.util.regex.Pattern;


public class RegExAndPatternTest {
	
	public static void main(String[] args) {
		
		// 전화번호가 서울 또는 휴대폰인 경우만 OK
		// 02-502-3325	=> OK
		// 010-2421-1241	=> OK
		// 051-311-3131	=> NOT OK
		String regEx = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "02-234-5678";
		boolean result = Pattern.matches(regEx, data);
		if (result) {
			System.out.println("정규식과 일치");
		} else {
			System.out.println("정규식과 불일치");
		}
		
		// 이메일 형식 검증
		regEx = "\\w+@\\w+\\.\\w+(\\.\\w+)*";
		data = "angel@navercom";
		result = Pattern.matches(regEx, data);
		if (result) {
			System.out.println("올바른 이메일");
		} else {
			System.out.println("이메일을 바르게 입력하세요!");
		}
	}
	
}






















