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
//		a.f2++;	// 컴파일 에러
//		a.m2();	// 컴파일 에러
		
		B b = new B();
		b.f++;	// 상속받은 f가 아니라,
				// B가 새롭게 정의한 f
		b.m();	// 상속받은 m()
		b.f2++;
		b.m2();
		b.m3();
		System.out.println(b.m4());
	}
}
