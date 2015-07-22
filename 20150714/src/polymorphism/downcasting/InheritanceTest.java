package polymorphism.downcasting;

class Shape {
	int i;
}

class Circle extends Shape {
	// int i;	// Shape로부터 상속
	int j;
}

public class InheritanceTest {
	public static void main(String[] args) {
//		Shape s = new Shape();
//		Circle c = (Circle) s;
//		System.out.println(c.i);
//		System.out.println(c.j);
		
		Shape s = new Circle();
		// 여기서는 s를 Shape 객체로 취급 ...

		
		
		// 다운캐스팅
		Circle c = (Circle) s;	// s를 Circle 타입으로 취급
		
	}
}
