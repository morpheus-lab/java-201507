package com.bit.shape;

public class Circle {
	
	private double radius;
	
	public Circle setRadius(double radius) {
		this.radius = radius;
		return this;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public Circle display() {
		System.out.println("이 원의 반지름은 " + radius
				+ ", 면적은 " + getArea());
		return this;
	}
	
}
