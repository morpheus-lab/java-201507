package test17_18;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}

	public void sayCircle() {
		System.out.println("Hello Circle");
	}
}

public class ClassTest {
	public static void main(String[] args) {
		Shape s = new Circle();
		Circle c = new Circle();
		s.draw();		// (1)
//		s.sayCircle();	// (2)
		c.draw();		// (3)
//		c.sayCircle();	// (4)
	}
}
