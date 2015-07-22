import java.io.InputStreamReader;
import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) throws Exception {
		InputStreamReader in = new InputStreamReader(System.in);
		char c = (char) -1;
		while (true) {
			if (c != '\r' && c != '\n') {
				System.out.println("문자를 입력하세요.");
			}
			// 사용자로부터 키보드 입력을 받음
			c = (char) in.read();
			if (c == '\r' || c == '\n') {
				continue;
			}
			// '0'을 입력했다면, 프로그램 종료
			if (c == '0') {
				break;
			}
			// 입력 글자가 대문자이면, 소문자로 변환
			if (c >= 'A' && c <= 'Z') {
//				c += 32;
//				c += 'a' - 'A';
				c |= 32;
			}
			// 입력 글자가 소문자이면, 대문자로 변환
			else if (c >= 'a' && c <= 'z') {
//				c -= 32;
				c ^= 32;
			}
			// 출력
			System.out.println("변환된 문자: " + c);
		}
		
		in.close();	// 자원 해제 (OS에 반환)
		
		System.out.println("프로그램을 종료합니다.");
	}

}





