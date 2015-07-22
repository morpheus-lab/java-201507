
public class ForLoop {
	
	public static void main(String[] args) {
		
		// 1~10까지 출력하는 for문을 작성하시오.
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("i=" + i);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i=" + (i + 1));
//		}
		
		// 1 ~ 100까지의 정수의 합을 구하시오.
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("1 ~ 100 정수 합: " + sum);
		
		// 구구단 출력
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				
			}
			System.out.println("----------------------");
		}
		
	}
	
}
