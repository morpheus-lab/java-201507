package string;
import java.util.StringTokenizer;


public class StringTokenizerTest {
	
	public static void main(String[] args) {
		/*
		String text = "È«±æµ¿&½ÉÃ»,ÄáÁã,ÆÏÁã-ÀÌ¸ù·æ";
		String[] names = text.split("&|,|-");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		*/
		
		String text = "È«±æµ¿&½ÉÃ»,ÄáÁã,ÆÏÁã-ÀÌ¸ù·æ";
		StringTokenizer st = new StringTokenizer(text, "&,-");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
	
}
















