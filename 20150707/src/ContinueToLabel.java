
public class ContinueToLabel {

	public static void main(String[] args) {
		
		int i = 0;
		
		lbl:
		while (i < 10) {
			System.out.println("���� �ݺ��� ����");
			while (i < 5) {
				i++;
				continue lbl;
			}
			System.out.println("���� �ݺ��� ��");
			i++;
		}
		
	}
	
}
