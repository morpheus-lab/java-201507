package abstractclass;

public abstract class Shape {
	protected double area;
	protected double circum;
	
	public abstract void makeArea();	// �� �޼ҵ�� ���� Ŭ��������
										// �ݵ�� �������̵�(������)�ؾ� ��
	
	public abstract void makeCircum();
	
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
