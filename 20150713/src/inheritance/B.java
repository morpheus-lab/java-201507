package inheritance;

public class B extends A {

	int f;
	int f2;
	void m2() {}
	void m3() { super.f += 10; }
	int m4() { return super.f; }
	
	public static void main(String[] args) {
		A a = new A();
		a.f++;
		a.m();
//		a.f2++;	// ������ ����
//		a.m2();	// ������ ����
		
		B b = new B();
		b.f++;	// ��ӹ��� f�� �ƴ϶�,
				// B�� ���Ӱ� ������ f
		b.m();	// ��ӹ��� m()
		b.f2++;
		b.m2();
		b.m3();
		System.out.println(b.m4());
	}
}
