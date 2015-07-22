import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		System.out.print("7���� ������ �Է��ϼ���: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	// ���� 1���� �о arr[i]�� ����
		}
		sc.close();
		
		// ���� ����
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				// i��°�� i+1��°�� ���ؼ�
				// i��°�� i+1��°���� ũ�ٸ�, �¹ٲ�
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		// ��� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		
	}

}
