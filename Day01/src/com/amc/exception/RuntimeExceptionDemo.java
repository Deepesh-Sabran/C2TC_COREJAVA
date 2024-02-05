package com.amc.exception;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[];
			arr = new int[] {1,2,3,4};
			System.out.println(arr[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
			// inbuilt method of throwable exception
			System.err.println("The error message is : " + e.getMessage());
		}
		System.out.println("End of program .. ");
	}
}
