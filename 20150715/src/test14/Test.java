package test14;

/* 다음 코드의 실행 결과는? */

public class Test {
	public int aMethod() {
		int i = 0;
		i++;
		return i;
	}

	public static void main(String args[]) {
		Test test = new Test();
		test.aMethod();
		int j = test.aMethod();
		System.out.println(j);
	}
}
