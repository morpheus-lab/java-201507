package abstractclass;

public abstract class Shape {
	protected double area;
	protected double circum;
	
	public abstract void makeArea();	// 이 메소드는 하위 클래스에서
										// 반드시 오버라이드(재정의)해야 함
	
	public abstract void makeCircum();
	
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
