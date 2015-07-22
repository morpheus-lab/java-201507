import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		System.out.print("7개의 정수를 입력하세요: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();	// 정수 1개를 읽어서 arr[i]에 저장
		}
		sc.close();
		
		// 정렬 시작
		for (int j = 0; j < arr.length - 1; j++) {
			for (int i = 0; i < arr.length - 1 - j; i++) {
				// i번째와 i+1번째를 비교해서
				// i번째가 i+1번째보다 크다면, 맞바꿈
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		// 결과 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		
	}

}
