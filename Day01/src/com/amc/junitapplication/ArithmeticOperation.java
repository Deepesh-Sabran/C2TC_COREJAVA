package com.amc.junitapplication;

public class ArithmeticOperation {
	public static int getSquare(int num) {
		return num+num;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
//		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
}
