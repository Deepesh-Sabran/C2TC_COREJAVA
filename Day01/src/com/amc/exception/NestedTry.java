package com.amc.exception;

public class NestedTry {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x, y, z;
			x=5;
			y=0;
			try {
				z = divide(x, y);
			} catch(ArithmeticException e) {
				System.out.println("Ther exception is : " + e.getMessage());
			}
		} catch(Exception e) {
			System.out.println("The exception is : " + e.getMessage());
		}
	}

	public static int divide(int x, int y) {
		// TODO Auto-generated method stub
		int z = x/y;
		return z;
	}
}
