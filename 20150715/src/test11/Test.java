package test11;

/* ���� �ڵ��� ���� �����?
 * A. 5
 * B. 10
 * C. 12
 * D. 17
 * E. ������ ����
 */

class MyClass {
	int x = 12;

	public void method(int x) {
		x += x;
		System.out.println(x);
	}
}

public class Test /*extends MyClass*/ {
	public static void main(String[] args) {
		Test t = new Test();
		t.method(5);
	}
}