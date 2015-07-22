import java.util.Scanner;

public class OmokGame {
	
	public static void printBadukpan(int[][] badukpan) {
		// 놓인 바둑돌 출력
		for (int y = 0; y < badukpan[0].length; y++) {
			for (int x = 0; x < badukpan.length; x++) {
				int dol = badukpan[x][y];
				switch (dol) {
					case 1:
						System.out.print("●");
						break;	// switch 빠져나감
					case 2:
						System.out.print("○");
						break;	// switch 빠져나감
					default:
						System.out.print("┼");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int size = 6;
		
		Scanner sc = new Scanner(System.in);
		int[][] badukpan = new int[size][size];
		
		boolean isBlackTurn = true;
		
		MAIN_LOOP:
		while (true) {
			printBadukpan(badukpan);
			int dolX = 0, dolY = 0;
			while (true) {
				// 사용자에게 바둑돌을 놓을 위치 입력 받기
				System.out.print(isBlackTurn ? "흑" : "백");
				System.out.print("돌을 놓을 좌표를 입력하세요(x,y): ");
				String input = sc.nextLine(); // 한 줄 한번에 읽기
				String[] xy = input.split(","); // ,로 스트링을 나눈다음 String[] 타입으로 리턴
				dolX = Integer.parseInt(xy[0]); // String -> int
				dolY = Integer.parseInt(xy[1]);
				if (dolX >= 0 && dolX < badukpan.length
						&& dolY >= 0 && dolY < badukpan[0].length) {
					if (badukpan[dolX][dolY] != 0) {
						// 이미 돌이 놓여 있는 경우
						System.out.println("이미 돌이 놓여 있습니다. 다시...");
					} else {
						// 유효 범위이고 돌이 없는 좌표인 경우 while 빠져나가기
						break;
					}
				} else {
					// 좌표 범위가 유효하지 않은 경우
					System.out.println("유효하지 않은 좌표입니다. 다시 입력...");
				}
			}
			badukpan[dolX][dolY] = isBlackTurn ? 1 : 2; // 바둑돌 놓기
			
			// 승리판정 - 누군가 한 명이 승리했다면 while문을 벗어나서 게임 종료될 수 있도록
			for (int y = 0; y < size; y++) {
				for (int x = 0; x < size; x++) {
					// 가로 승리
					if (x > 1 && x < size - 2) {
						int centerDol = badukpan[x][y];	// 5개 돌 중 가운데 돌
						if (centerDol != 0
								&& badukpan[x-2][y] == centerDol
								&& badukpan[x-1][y] == centerDol
								&& badukpan[x+1][y] == centerDol
								&& badukpan[x+2][y] == centerDol) {
							// centerDol의 승리
							String winner = centerDol == 1 ? "흑" : "백";
							System.out.println("축하합니다. " + winner + "돌의 승리! (가로)");
							break MAIN_LOOP;
						}
					}
					// 세로 승리
					if (y > 1 && y < size - 2) {
						int centerDol = badukpan[x][y];
						if (centerDol != 0
								&& badukpan[x][y-2] == centerDol
								&& badukpan[x][y-1] == centerDol
								&& badukpan[x][y+1] == centerDol
								&& badukpan[x][y+2] == centerDol) {
							// centerDol의 승리
							String winner = centerDol == 1 ? "흑" : "백";
							System.out.println("축하합니다. " + winner + "돌의 승리! (세로)");
							break MAIN_LOOP;
						}
					}
					// 대각선 승리
					if (x > 1 && x < size - 2 && y > 1 && y < size - 2) {	//center의 범위
						int centerDol = badukpan[x][y];
						// 대각선1 승리
						if (centerDol != 0
								&& badukpan[x-2][y-2] == centerDol
								&& badukpan[x-1][y-1] == centerDol
								&& badukpan[x+1][y+1] == centerDol
								&& badukpan[x+2][y+2] == centerDol) {
							// centerDol의 승리
							String winner = centerDol == 1 ? "흑" : "백";
							System.out.println("축하합니다. " + winner + "돌의 승리! (대각선1)");
							break MAIN_LOOP;
						}
						// 대각선2 승리
						else if (centerDol != 0
								&& badukpan[x-2][y+2] == centerDol
								&& badukpan[x-1][y+1] == centerDol
								&& badukpan[x+1][y-1] == centerDol
								&& badukpan[x+2][y-2] == centerDol) {
							// centerDol의 승리
							String winner = centerDol == 1 ? "흑" : "백";
							System.out.println("축하합니다. " + winner + "돌의 승리! (대각선2)");
							break MAIN_LOOP;
						}
					}
				}
			}			
			isBlackTurn = !isBlackTurn;
		}
		
		printBadukpan(badukpan);	// 프로그램 종료 전, 결과 출력
		
		sc.close();
	}
	
}























