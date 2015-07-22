
public class CallByValue {

	static void change(char c) {
		if (c == ' ') {
			c = ',';
		}
	}

	public static void main(String[] args) {
		char[] cArr = {'T','h','i','s',' ',
				'i','s',' ',
				'a',' ',
				'p','e','n','c','i','l','.'};
		
		for (int i = 0; i < cArr.length; i++) {
			change(cArr[i]);
		}
		
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]);
		}
	}
}
