package test12;

/* ���� �ڵ��� ���� �����? */

class Base {
	Base() {
		System.out.println("��");
	}
}

public class Alpha extends Base {
	public static void main(String[] args) {
		Alpha aa = new Alpha();
		Base bb = new Base();
	}
}