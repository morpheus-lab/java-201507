package innerclass;

class A {
	class B {	// ���� Ŭ����(inner class)
	}
	static class C {	// ����ƽ ���� Ŭ����
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
//		B b = new B();	// �Ұ���
		
		A a = new A();
		A.B b = a.new B();
		
		A.C c = new A.C();
	}
}
