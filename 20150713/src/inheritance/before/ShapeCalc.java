package inheritance.before;

public class ShapeCalc {

	public static void main(String[] args) {
		Circle c = new Circle(4.7);
		c.makeArea();
		c.makeCircum();
		c.display();
		System.out.println("면적: " + c.getArea());
		System.out.println("둘레: " + c.getCircum());
		System.out.println("반경: " + c.getRadius());
		
		System.out.println("-----------------------");
		
		Rectangle r = new Rectangle(4.0, 6.0);
		r.makeArea();
		r.makeCircum();
		r.display();
		System.out.println("면적: " + r.getArea());
		System.out.println("둘레: " + r.getCircum());
		System.out.println("너비: " + r.getWidth());
		System.out.println("높이: " + r.getHeight());
	}

}
