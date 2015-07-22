package inheritance.constructor;

class A {
	public A() {
		System.out.println("A�� ������ ȣ���");
	}
	public A(int i) {
		System.out.println("A�� ������2 ȣ���");
	}
}

class B extends A {
	public B() {
		System.out.println("B�� ������ ȣ���");
	}
	public B(int a) {
		super();	// ���� Ŭ���� �����ڰ�
					// ���� ȣ��ǵ��� �ؾ� ��
		System.out.println("B�� ������2 ȣ���");
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		B b = new B(3);
	}
}
