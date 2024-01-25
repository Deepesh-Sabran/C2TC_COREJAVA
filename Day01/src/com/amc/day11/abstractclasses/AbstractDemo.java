package com.amc.day11.abstractclasses;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Rectangle r1 = new Rectangle(8.0f, 9.0f);
//		r1.calculateArea();
//		r1.show();
//		
//		Square s1 = new Square(5.0f);
//		s1.calculateArea();
//		s1.show();
		
		// Dynamic Binding
		Shape shape;
		shape = new Square(3);
		shape.calculateArea();
		shape.show();

		shape = new Rectangle();
		shape.calculateArea();
		shape.show();
	}
}
