package inheritance.constructor2;

class A {
	static int print(String msg) {
		System.out.println(msg);
		return 0;
	}
	int i = A.print("A의 필드 초기화");
	public A() {
		A.print("생성자 A()의 몸체 실행");
	}
}

class B extends A {
	int j = A.print("B의 필드 초기화");
	public B() {
		A.print("생성자 B()의 몸체 실행");
	}
}

public class ConstructorTest2 {
	public static void main(String[] args) {
		B obj = new B();
	}
}
