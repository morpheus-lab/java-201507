package videoshop;

import java.util.Scanner;

public class VideoShopMain {
	static Item[] itemList = new Item[10];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		main_loop:
		while (true) {
			System.out.println("*******************");
			System.out.println("*  ������ ����  *");
			System.out.println("*******************");
			System.out.println("�޴�");
			System.out.println("  1. �뿩");
			System.out.println("  2. �ݳ�");
			System.out.println("  3. ���");
			System.out.println("  4. ��ȸ");
			System.out.println("  0. ����");
			System.out.print(  "����: ");
			int menu = scanner.nextInt();

			System.out.println("-------------------");

			switch (menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				// ������ ��� ���μ���
				System.out.println("����");
				System.out.println("  1. ����������");
				System.out.println("  2. DVD");
				System.out.println("  3. ����");
				System.out.print(  "����: ");
				int type = scanner.nextInt();
				scanner.nextLine();	// ������ ���� �Һ�

				System.out.print(  "����: ");
				String title = scanner.nextLine();

				System.out.println("�帣");
				System.out.println("  1. �׼�");
				System.out.println("  2. ��Ÿ�� / SF");
				System.out.println("  3. �θǽ� / ���");
				System.out.println("  4. �Ҽ�");
				System.out.print(  "����: ");
				int genre = scanner.nextInt();
				scanner.nextLine();	// ���� �Ұ�
				
				String isbn = null;
				if (type == 3) {
					System.out.print(  "ISBN: ");
					isbn = scanner.nextLine();
				}
				
				System.out.print(  "�뿩��: ");
				int fee = scanner.nextInt();
				scanner.nextLine();	// �Է� ���ۿ� �����ִ�
									// ���͸� �Һ��ϱ� ����

				System.out.println("-------------------");
				System.out.println("�Է³���:");
				System.out.println("  ��  ��: " + type);
				System.out.println("  ��  ��: " + title);
				System.out.println("  ��  ��: " + genre);
				if (type == 3) {
					System.out.println("  ISBN  : " + isbn);
				}
				System.out.println("  �뿩��: " + fee);

				System.out.print(  "�����Ͻðڽ��ϱ�? (Y/N): ");
				String save = scanner.nextLine();
				if (save.toUpperCase().equals("Y")) {
					// ����
					int emptyIndex = 0;
					for (int i = 0; i < itemList.length; i++) {
						if (itemList[i] == null) {
							emptyIndex = i;
							break;
						}
					}
					if (emptyIndex > itemList.length - 1) {
						// �̹� �� ��
						System.out.println("�� �̻� ���� �Ұ�!!");
					} else {
						Item item = null;
						switch (type) {
						case 1:
							item = new VideoTape();
							break;
						case 2:
							break;
						case 3:
							item = new Book();
							((Book) item).setIsbn(isbn);
							break;
						default:
							break;
						}
						item.setType(type);
						item.setTitle(title);
						item.setGenre(genre);
						item.setFee(fee);
						itemList[emptyIndex] = item;	// �迭�� ����
					}
				}
				break;
			case 4:	// 4. ��ȸ
				for (int i = 0; i < itemList.length; i++) {
					Item item = itemList[i];
					if (item != null) {
						System.out.printf("[%d] %s (�뿩��: %d��)\n",
								i, item.getTitle(), item.getFee());
					}
				}
				break;
			case 0:
				// while���� ������� �ؼ�
				// ���α׷��� ����� �� �ֵ���
				break main_loop;
			default:
				break;
			}
		}

		scanner.close();
	}
}
