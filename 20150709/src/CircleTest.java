
public class CircleTest {

	public static void main(String[] args) {
		System.out.println(Circle.name);
		
		// �� ��ü 2�� ����
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("c1�� ������: " + c1.radius);
		System.out.println("c2�� ������: " + c2.radius);
		
		c1.radius = 4;
		System.out.println("c1�� ������ ��������");
		System.out.println("c1�� ������: " + c1.radius);
		System.out.println("c2�� ������: " + c2.radius);
		
		c2.radius = 5;
		System.out.println("c2�� ������ ��������");
		System.out.println("c1�� ������: " + c1.radius);
		System.out.println("c2�� ������: " + c2.radius);
		
		c1.name = "������";
		System.out.println("c1�� �̸� ����");
		System.out.println("c1�� �̸�: " + c1.name);
		System.out.println("c2�� �̸�: " + c2.name);
		System.out.println("Circle�� �̸�: " + Circle.name);
	}

}
