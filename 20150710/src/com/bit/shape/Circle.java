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
		System.out.println("�� ���� �������� " + radius
				+ ", ������ " + getArea());
		return this;
	}
	
}
