package innerclass;

interface IA {
	void doSomething();
}

public class AnonymousClassObjectTest {
	public static void main(String[] args) {
		IA ia = new IA() {
			// ���Ⱑ �� �͸� Ŭ������ ���� �κ�
			
			// �������̽� �޼ҵ� ����
			public void doSomething() {
				System.out.println("YAY~~!!!");
			}
			
		};
		ia.doSomething();
	}
}
