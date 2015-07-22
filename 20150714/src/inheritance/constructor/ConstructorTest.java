package inheritance.constructor;

class A {
	public A() {
		System.out.println("A의 생성자 호출됨");
	}
	public A(int i) {
		System.out.println("A의 생성자2 호출됨");
	}
}

class B extends A {
	public B() {
		System.out.println("B의 생성자 호출됨");
	}
	public B(int a) {
		super();	// 상위 클래스 생성자가
					// 먼저 호출되도록 해야 함
		System.out.println("B의 생성자2 호출됨");
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		B b = new B(3);
	}
}
