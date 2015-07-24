package innerclass;

interface IA {
	void doSomething();
}

public class AnonymousClassObjectTest {
	public static void main(String[] args) {
		IA ia = new IA() {
			// 여기가 이 익명 클래스의 정의 부분
			
			// 인터페이스 메소드 구현
			public void doSomething() {
				System.out.println("YAY~~!!!");
			}
			
		};
		ia.doSomething();
	}
}
