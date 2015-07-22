package inheritance.before;

public class Rectangle {
	
	// ��� �ʵ�
	private double width;
	private double height;
	private double area;
	private double circum;
	
	// ������
	public Rectangle() {}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// ��� �޼ҵ�
	public void makeArea() {
		area = width * height;
	}
	
	public void makeCircum() {
		circum = (width + height) * 2;
	}
	
	public void display() {
		System.out.println("������ " + area + "�̰�, �ѷ��� " + circum);
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
