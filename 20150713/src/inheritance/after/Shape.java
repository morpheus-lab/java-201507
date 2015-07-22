package inheritance.after;

public class Shape {
	protected double area;
	protected double circum;
	
	public void makeArea() {
		// 도형 종류에 따라 다른 계산법
	}
	
	public void makeCircum() {
		// 도형 종류에 따라 다른 계산법
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
}
