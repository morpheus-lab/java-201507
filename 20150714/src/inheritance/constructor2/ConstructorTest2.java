package inheritance.constructor2;

class A {
	static int print(String msg) {
		System.out.println(msg);
		return 0;
	}
	int i = A.print("A�� �ʵ� �ʱ�ȭ");
	public A() {
		A.print("������ A()�� ��ü ����");
	}
}

class B extends A {
	int j = A.print("B�� �ʵ� �ʱ�ȭ");
	public B() {
		A.print("������ B()�� ��ü ����");
	}
}

public class ConstructorTest2 {
	public static void main(String[] args) {
		B obj = new B();
	}
}
