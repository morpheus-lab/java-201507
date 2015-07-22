package exception;

public class X {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
			ex.printStackTrace();
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		// 아래 Error와 RuntimeException은 컴파일러가 체크하지 않는
		// Unchecked Exception입니다.
		// 그래서 throws 절이 없어도 컴파일 에러가 발생하지 않음
		
//		throw new Error();
		throw new RuntimeException();
	}
}
