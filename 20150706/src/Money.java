import java.util.Scanner;

public class Money {
	
	final static int 오만원 = 50000;
	final static int 만원 = 10000;
	final static int 오천원 = 5000;
	final static int 천원 = 1000;
	final static int 오백원 = 500;
	final static int 백원 = 100;
	final static int 오십원 = 50;
	final static int 십원 = 10;
	final static int 오원 = 5;
	final static int 일원 = 1;
	
	public static void main(String[] args) {
		int money = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		money = sc.nextInt();
		sc.close();	// 스캐너 자원 (키보드 입력) 반납
		
		count = money / 오만원;	// 오만원권이 몇 장 필요?
		if (count > 0)
			System.out.println("오만원권 " + count + "매");
		money = money % 오만원;	// 나머지 금액을 새로운 money 값으로
//		money %= 오만원;
		
		count = money / 만원;	// 만원권이 몇 장 필요?
		if (count > 0)
			System.out.println("만원권 " + count + "매");
		money %= 만원;	// 나머지 금액을 새로운 money 값으로
		
		count = money / 오천원;	// 오천원권이 몇 장 필요?
		if (count > 0)
			System.out.println("오천원권 " + count + "매");
		money %= 오천원;	// 나머지 금액을 새로운 money 값으로
		
		count = money / 천원;	// 천원권이 몇 장 필요?
		if (count > 0)
			System.out.println("천원권 " + count + "매");
		money %= 천원;	// 나머지 금액을 새로운 money 값으로
		
		count = money / 오백원;	// 오백원 동전이 몇 개 필요?
		if (count > 0)
			System.out.println("오백원 " + count + "개");
		money %= 오백원;	// 나머지 금액을 새로운 money 값으로
		
		count = money / 백원;	// 백원 동전이 몇 개 필요?
		if (count > 0)
			System.out.println("백원 " + count + "개");
		money %= 백원;	// 나머지 금액을 새로운 money 값으로
		
		count = money / 오십원;	// 오십원 동전이 몇 개 필요?
		if (count > 0)
			System.out.println("오십원 " + count + "개");
		money %= 오십원;	// 나머지 금액을 새로운 money 값으로
		
		count = money / 십원;	// 십원 동전이 몇 개 필요?
		if (count > 0)
			System.out.println("십원 " + count + "개");
		money %= 십원;	// 나머지 금액을 새로운 money 값으로
		
		count = money / 오원;	// 오원 동전이 몇 개 필요?
		if (count > 0)
			System.out.println("오원 " + count + "개");
		money %= 오원;	// 나머지 금액을 새로운 money 값으로
		
		if (money > 0) {
			System.out.println("일원 " + money + "개");
		}
		
		
	}
	
}









