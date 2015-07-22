
public class CircleTest {

	public static void main(String[] args) {
		System.out.println(Circle.name);
		
		// 원 객체 2개 생성
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("c1의 반지름: " + c1.radius);
		System.out.println("c2의 반지름: " + c2.radius);
		
		c1.radius = 4;
		System.out.println("c1의 반지름 설정했음");
		System.out.println("c1의 반지름: " + c1.radius);
		System.out.println("c2의 반지름: " + c2.radius);
		
		c2.radius = 5;
		System.out.println("c2의 반지름 설정했음");
		System.out.println("c1의 반지름: " + c1.radius);
		System.out.println("c2의 반지름: " + c2.radius);
		
		c1.name = "작은원";
		System.out.println("c1의 이름 설정");
		System.out.println("c1의 이름: " + c1.name);
		System.out.println("c2의 이름: " + c2.name);
		System.out.println("Circle의 이름: " + Circle.name);
	}

}
