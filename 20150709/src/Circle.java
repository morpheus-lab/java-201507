
public class Circle {
	
	static String name = "��";
	double radius;
	
	void setRadius(double r) {	// �ڽ��� radius �� ����
		radius = r;
	}
	
	double getArea() {	// �ڽ��� radius�� �̿��ؼ� �ڱ� ������ ���
		return Math.PI * radius * radius;
	}
	
	void display() {	// �ڽ��� radius�� ������ ���
		System.out.println("�������� " + radius + "�� ���� ������ " + getArea());
	}
	
}
