
public class Circle {
	
	static String name = "원";
	double radius;
	
	void setRadius(double r) {	// 자신의 radius 값 설정
		radius = r;
	}
	
	double getArea() {	// 자신의 radius를 이용해서 자기 면적을 계산
		return Math.PI * radius * radius;
	}
	
	void display() {	// 자신의 radius와 면적을 출력
		System.out.println("반지름이 " + radius + "인 원의 면적은 " + getArea());
	}
	
}
