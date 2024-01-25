package com.amc.day11.abstractclasses;

public class Rectangle extends Shape {
	float length, breadth;
	
	public Rectangle() {
		this.length = 3.0f;
		this.breadth = 4.0f;
	}
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		area = length * breadth;
	}
}
