
public class ContinueToLabel {

	public static void main(String[] args) {
		
		int i = 0;
		
		lbl:
		while (i < 10) {
			System.out.println("내부 반복문 시작");
			while (i < 5) {
				i++;
				continue lbl;
			}
			System.out.println("내부 반복문 끝");
			i++;
		}
		
	}
	
}
