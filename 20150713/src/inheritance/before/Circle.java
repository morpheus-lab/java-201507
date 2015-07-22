package inheritance.before;

public class Circle {
	
	// 멤버 필드 (변수)
	private double radius;
	private double area;
	private double circum;
	
	// 생성자
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// 멤버 메소드
	public void makeArea() {
		//area = Math.PI * radius * radius;
		area = Math.PI * Math.pow(radius, 2);
	}
	
	public void makeCircum() {
		circum = 2 * Math.PI * radius;
	}
	
	public void display() {
		System.out.println("면적은 " + area + "이고, 둘레는 " + circum);
	}
	
	public double getArea() {
		return area;
	}
	
	public double getCircum() {
		return circum;
	}
	
	public double getRadius() {
		return radius;
	}
	
}
