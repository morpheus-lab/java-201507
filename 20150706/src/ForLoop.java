
public class ForLoop {
	
	public static void main(String[] args) {
		
		// 1~10���� ����ϴ� for���� �ۼ��Ͻÿ�.
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("i=" + i);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i=" + (i + 1));
//		}
		
		// 1 ~ 100������ ������ ���� ���Ͻÿ�.
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("1 ~ 100 ���� ��: " + sum);
		
		// ������ ���
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				
			}
			System.out.println("----------------------");
		}
		
	}
	
}
