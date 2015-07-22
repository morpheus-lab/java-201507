
public class SwitchStmt {
	
	public static void main(String[] args) {
		
		/*int i = 8;
		
		switch (i % 5) {
		case 0:
		case 1:
			System.out.println("5의 배수 혹은 +1");
			break;
		case 2:
			System.out.println("5의 배수 +2");
		default:
			System.out.println("DEFAULT");
		}*/
		
		// String in switch
		String s = "B";
		switch (s) {
		case "A":
			System.out.println("A 학점 이군요! 대단합니다!!");
			break;
		case "BBB":
			System.out.println("응??");
			break;
		case "B":
			System.out.println("B 학점 이군요. 참 잘했어요.");
			break;
		default:
			
		}
		
	}
	
}
