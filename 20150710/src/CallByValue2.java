
public class CallByValue2 {

	static void change(char[] cArr) {
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == ' ') {
				cArr[i] = ',';
			}
		}
	}

	public static void main(String[] args) {
		char[] cArr = {'T','h','i','s',' ',
				'i','s',' ',
				'a',' ',
				'p','e','n','c','i','l','.'};
		change(cArr);
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]);
		}
	}
}
