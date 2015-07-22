import java.util.Scanner;

public class OmokGame {
	
	public static void printBadukpan(int[][] badukpan) {
		// ���� �ٵϵ� ���
		for (int y = 0; y < badukpan[0].length; y++) {
			for (int x = 0; x < badukpan.length; x++) {
				int dol = badukpan[x][y];
				switch (dol) {
					case 1:
						System.out.print("��");
						break;	// switch ��������
					case 2:
						System.out.print("��");
						break;	// switch ��������
					default:
						System.out.print("��");
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
				// ����ڿ��� �ٵϵ��� ���� ��ġ �Է� �ޱ�
				System.out.print(isBlackTurn ? "��" : "��");
				System.out.print("���� ���� ��ǥ�� �Է��ϼ���(x,y): ");
				String input = sc.nextLine(); // �� �� �ѹ��� �б�
				String[] xy = input.split(","); // ,�� ��Ʈ���� �������� String[] Ÿ������ ����
				dolX = Integer.parseInt(xy[0]); // String -> int
				dolY = Integer.parseInt(xy[1]);
				if (dolX >= 0 && dolX < badukpan.length
						&& dolY >= 0 && dolY < badukpan[0].length) {
					if (badukpan[dolX][dolY] != 0) {
						// �̹� ���� ���� �ִ� ���
						System.out.println("�̹� ���� ���� �ֽ��ϴ�. �ٽ�...");
					} else {
						// ��ȿ �����̰� ���� ���� ��ǥ�� ��� while ����������
						break;
					}
				} else {
					// ��ǥ ������ ��ȿ���� ���� ���
					System.out.println("��ȿ���� ���� ��ǥ�Դϴ�. �ٽ� �Է�...");
				}
			}
			badukpan[dolX][dolY] = isBlackTurn ? 1 : 2; // �ٵϵ� ����
			
			// �¸����� - ������ �� ���� �¸��ߴٸ� while���� ����� ���� ����� �� �ֵ���
			for (int y = 0; y < size; y++) {
				for (int x = 0; x < size; x++) {
					// ���� �¸�
					if (x > 1 && x < size - 2) {
						int centerDol = badukpan[x][y];	// 5�� �� �� ��� ��
						if (centerDol != 0
								&& badukpan[x-2][y] == centerDol
								&& badukpan[x-1][y] == centerDol
								&& badukpan[x+1][y] == centerDol
								&& badukpan[x+2][y] == centerDol) {
							// centerDol�� �¸�
							String winner = centerDol == 1 ? "��" : "��";
							System.out.println("�����մϴ�. " + winner + "���� �¸�! (����)");
							break MAIN_LOOP;
						}
					}
					// ���� �¸�
					if (y > 1 && y < size - 2) {
						int centerDol = badukpan[x][y];
						if (centerDol != 0
								&& badukpan[x][y-2] == centerDol
								&& badukpan[x][y-1] == centerDol
								&& badukpan[x][y+1] == centerDol
								&& badukpan[x][y+2] == centerDol) {
							// centerDol�� �¸�
							String winner = centerDol == 1 ? "��" : "��";
							System.out.println("�����մϴ�. " + winner + "���� �¸�! (����)");
							break MAIN_LOOP;
						}
					}
					// �밢�� �¸�
					if (x > 1 && x < size - 2 && y > 1 && y < size - 2) {	//center�� ����
						int centerDol = badukpan[x][y];
						// �밢��1 �¸�
						if (centerDol != 0
								&& badukpan[x-2][y-2] == centerDol
								&& badukpan[x-1][y-1] == centerDol
								&& badukpan[x+1][y+1] == centerDol
								&& badukpan[x+2][y+2] == centerDol) {
							// centerDol�� �¸�
							String winner = centerDol == 1 ? "��" : "��";
							System.out.println("�����մϴ�. " + winner + "���� �¸�! (�밢��1)");
							break MAIN_LOOP;
						}
						// �밢��2 �¸�
						else if (centerDol != 0
								&& badukpan[x-2][y+2] == centerDol
								&& badukpan[x-1][y+1] == centerDol
								&& badukpan[x+1][y-1] == centerDol
								&& badukpan[x+2][y-2] == centerDol) {
							// centerDol�� �¸�
							String winner = centerDol == 1 ? "��" : "��";
							System.out.println("�����մϴ�. " + winner + "���� �¸�! (�밢��2)");
							break MAIN_LOOP;
						}
					}
				}
			}			
			isBlackTurn = !isBlackTurn;
		}
		
		printBadukpan(badukpan);	// ���α׷� ���� ��, ��� ���
		
		sc.close();
	}
	
}























