package innerclass;

class A {
	class B {	// 내부 클래스(inner class)
	}
	static class C {	// 스태틱 내부 클래스
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
//		B b = new B();	// 불가능
		
		A a = new A();
		A.B b = a.new B();
		
		A.C c = new A.C();
	}
}
