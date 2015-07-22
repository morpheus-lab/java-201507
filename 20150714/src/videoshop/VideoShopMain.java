package videoshop;

import java.util.Scanner;

public class VideoShopMain {
	static Item[] itemList = new Item[10];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		main_loop:
		while (true) {
			System.out.println("*******************");
			System.out.println("*  비디오샵 관리  *");
			System.out.println("*******************");
			System.out.println("메뉴");
			System.out.println("  1. 대여");
			System.out.println("  2. 반납");
			System.out.println("  3. 등록");
			System.out.println("  4. 조회");
			System.out.println("  0. 종료");
			System.out.print(  "선택: ");
			int menu = scanner.nextInt();

			System.out.println("-------------------");

			switch (menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				// 아이템 등록 프로세스
				System.out.println("종류");
				System.out.println("  1. 비디오테이프");
				System.out.println("  2. DVD");
				System.out.println("  3. 도서");
				System.out.print(  "선택: ");
				int type = scanner.nextInt();
				scanner.nextLine();	// 버퍼의 엔터 소비

				System.out.print(  "제목: ");
				String title = scanner.nextLine();

				System.out.println("장르");
				System.out.println("  1. 액션");
				System.out.println("  2. 판타지 / SF");
				System.out.println("  3. 로맨스 / 드라마");
				System.out.println("  4. 소설");
				System.out.print(  "선택: ");
				int genre = scanner.nextInt();
				scanner.nextLine();	// 엔터 소거
				
				String isbn = null;
				if (type == 3) {
					System.out.print(  "ISBN: ");
					isbn = scanner.nextLine();
				}
				
				System.out.print(  "대여료: ");
				int fee = scanner.nextInt();
				scanner.nextLine();	// 입력 버퍼에 남아있는
									// 엔터를 소비하기 위해

				System.out.println("-------------------");
				System.out.println("입력내용:");
				System.out.println("  종  류: " + type);
				System.out.println("  제  목: " + title);
				System.out.println("  장  르: " + genre);
				if (type == 3) {
					System.out.println("  ISBN  : " + isbn);
				}
				System.out.println("  대여료: " + fee);

				System.out.print(  "저장하시겠습니까? (Y/N): ");
				String save = scanner.nextLine();
				if (save.toUpperCase().equals("Y")) {
					// 저장
					int emptyIndex = 0;
					for (int i = 0; i < itemList.length; i++) {
						if (itemList[i] == null) {
							emptyIndex = i;
							break;
						}
					}
					if (emptyIndex > itemList.length - 1) {
						// 이미 꽉 참
						System.out.println("더 이상 저장 불가!!");
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
						itemList[emptyIndex] = item;	// 배열에 저장
					}
				}
				break;
			case 4:	// 4. 조회
				for (int i = 0; i < itemList.length; i++) {
					Item item = itemList[i];
					if (item != null) {
						System.out.printf("[%d] %s (대여료: %d원)\n",
								i, item.getTitle(), item.getFee());
					}
				}
				break;
			case 0:
				// while문을 벗어나도록 해서
				// 프로그램이 종료될 수 있도록
				break main_loop;
			default:
				break;
			}
		}

		scanner.close();
	}
}
