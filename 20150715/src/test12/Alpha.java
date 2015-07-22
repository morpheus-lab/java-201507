package test12;

/* 다음 코드의 실행 결과는? */

class Base {
	Base() {
		System.out.println("콜");
	}
}

public class Alpha extends Base {
	public static void main(String[] args) {
		Alpha aa = new Alpha();
		Base bb = new Base();
	}
}