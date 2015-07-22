import java.util.Random;
import java.util.Scanner;

public class ShowMeTheNumber {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		// 랜덤 정수를 생성
		int 정답 = random.nextInt(10);
		
		// 사용자에게 맞춰봐
		System.out.println("0에서 9까지의 정수 중 하나를 골라보세요.");
		
		// 사용자로부터 입력 받기
		Scanner s = new Scanner(System.in);
		int 입력값 = s.nextInt();	// 스캐너가 정수를 하나 읽어 들여서 저장
		
		// 맞는지 검사
		if (정답 == 입력값) {
			// true 이면
			System.out.println("정답입니다~!");
		} else {
			// false 이면
			System.out.println("땡!!! 정답은 " + 정답 + " 입니다.");
		}
		
	}
	
}
