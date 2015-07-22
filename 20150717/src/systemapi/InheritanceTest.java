package systemapi;

class B {
	int i;
	B() {}
	B(int i) { this.i = i; }
	
	// Object클래스의 equals()를 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			return (this.i == ((B) obj).i);
		} else {
			return false;
		}
	}
	
	// Object의 toString() 상속 => 오버라이딩
	public String toString() {
		return "이 객체의 i 값은 " + this.i;
	}
}

public class InheritanceTest {
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void equalsTest(Object o1, Object o2) {
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
	}
	
	public static void main(String[] args) {
		B b1 = new B(10);
		B b2 = new B(10);
		Object o1 = new Object();
		Object o2 = new Object();
		
		print(b1);	// systemapi.B@{16진수 해시코드}
//		System.out.println(Integer.toString(b1.hashCode(), 16));
		print(b2);	// systemapi.B@{16진수 해시코드}
//		print(o1);	// java.lang.Object@{16진수 해시코드}
//		print(o2);	// java.lang.Object@{16진수 해시코드}
		
//		equalsTest(b1, b2);
//		equalsTest(o1, o2);
		
//		o1 = b1;
//		print(b1);	// systemapi.B@1ab232
//		print(o1);	// systemapi.B@1ab232
		
//		equalsTest(o1, b1);
	}
	
}











