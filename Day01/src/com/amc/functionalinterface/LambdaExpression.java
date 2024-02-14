package com.amc.functionalinterface;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Statment s = () -> {return "Hello World";};
		Statment s = () -> "Hello World"; // for single statment we dont need to use return & the curly braces
		System.out.println(s.greet());
	}

}
