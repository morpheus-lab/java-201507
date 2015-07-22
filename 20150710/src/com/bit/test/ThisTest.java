package com.bit.test;

import com.bit.shape.*;

public class ThisTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Rectangle r = new Rectangle();
		
//		Circle c = circle1.setRadius(3);
//		c.display();
		
//		(((circle1.setRadius(3)).display()).setRadius(5)).display();
		
		circle1.setRadius(3).display().setRadius(5).display();
	}
	
}
