package test13;

/* 다음 코드의 실행 결과는? */

public class Change {
	static String str = "ABC123";

	public static void change(String str) {
		Change.str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After:" + Change.str);
	}
}
