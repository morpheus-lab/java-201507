package polymorphism.downcasting;

class Shape {
	int i;
}

class Circle extends Shape {
	// int i;	// Shape�κ��� ���
	int j;
}

public class InheritanceTest {
	public static void main(String[] args) {
//		Shape s = new Shape();
//		Circle c = (Circle) s;
//		System.out.println(c.i);
//		System.out.println(c.j);
		
		Shape s = new Circle();
		// ���⼭�� s�� Shape ��ü�� ��� ...

		
		
		// �ٿ�ĳ����
		Circle c = (Circle) s;	// s�� Circle Ÿ������ ���
		
	}
}
