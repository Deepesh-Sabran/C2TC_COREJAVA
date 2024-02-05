package com.amc.interf;

public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(5.0);
		Shape rectangle = new Rectangle(4.0, 6.0);
		
		// calculating & displaying area
		displayShapeInfo(circle);
		displayShapeInfo(rectangle);
	}
	// method that accept any shape & display
	private static void displayShapeInfo(Shape shape) {
		System.out.println("Area : "+ shape.calculateArea());
		System.out.println("Perimeter : "+ shape.calculatePerimeter());
		System.out.println();
	}
}
