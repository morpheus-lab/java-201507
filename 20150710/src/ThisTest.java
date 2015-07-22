
public class ThisTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		
//		Circle c = circle1.setRadius(3);
//		c.display();
		
//		(((circle1.setRadius(3)).display()).setRadius(5)).display();
		
		circle1.setRadius(3).display().setRadius(5).display();
	}
	
}
