package inheritance.after;

public class Shape {
	protected double area;
	protected double circum;
	
	public void makeArea() {
		// ���� ������ ���� �ٸ� ����
	}
	
	public void makeCircum() {
		// ���� ������ ���� �ٸ� ����
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
}
