package inheritance.before;

public class ShapeCalc {

	public static void main(String[] args) {
		Circle c = new Circle(4.7);
		c.makeArea();
		c.makeCircum();
		c.display();
		System.out.println("����: " + c.getArea());
		System.out.println("�ѷ�: " + c.getCircum());
		System.out.println("�ݰ�: " + c.getRadius());
		
		System.out.println("-----------------------");
		
		Rectangle r = new Rectangle(4.0, 6.0);
		r.makeArea();
		r.makeCircum();
		r.display();
		System.out.println("����: " + r.getArea());
		System.out.println("�ѷ�: " + r.getCircum());
		System.out.println("�ʺ�: " + r.getWidth());
		System.out.println("����: " + r.getHeight());
	}

}
