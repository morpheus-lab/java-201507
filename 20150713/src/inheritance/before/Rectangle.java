package inheritance.before;

public class Rectangle {
	
	// 멤버 필드
	private double width;
	private double height;
	private double area;
	private double circum;
	
	// 생성자
	public Rectangle() {}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// 멤버 메소드
	public void makeArea() {
		area = width * height;
	}
	
	public void makeCircum() {
		circum = (width + height) * 2;
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
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
}
