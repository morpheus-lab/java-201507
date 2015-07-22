package abstractclass;

public abstract class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle() {}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
//	@Override	// �������̵� (�޼ҵ� ������)
//	public void makeArea() {
//		area = width * height;
//	}
//	
//	@Override
//	public void makeCircum() {
//		circum = (width + height) * 2;
//	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
}
