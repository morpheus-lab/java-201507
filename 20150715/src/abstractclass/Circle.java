package abstractclass;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override	// annotation: 컴파일러에게 어떤 지시를 하기 위함
	public void makeArea() {
		area = Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public void makeCircum() {
		circum = 2 * Math.PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
}
