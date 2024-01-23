package com.amc.day09.overriding;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		
		// Dynamic Binding : where u create child class obj. to parent class variable as a ref.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());
	}
}
