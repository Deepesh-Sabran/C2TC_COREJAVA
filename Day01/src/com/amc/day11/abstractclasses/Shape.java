package com.amc.day11.abstractclasses;

public abstract class Shape {
	float area;
	public abstract void calculateArea();
	
	void show() {
		System.out.println("Area of the shape is : " + area);
	}
}
