import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요.");
		
		int year = scanner.nextInt();	// 사용자가 입력하는 문자열을
										// int 타입으로 읽어서 반환
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		scanner.close();
		
	}

}
