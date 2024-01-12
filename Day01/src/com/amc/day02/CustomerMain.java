package com.amc.day02;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer id");
		int id = sc.nextInt();
		System.out.println("Enter the customer name");
		String name = sc.next(); // this is because the first input in read totally
		sc.nextLine();
		System.out.println("Enter the customer city");
		String city = sc.nextLine();
		sc.close();
		
		Customer cOne = new Customer();
		cOne.setCustomerId(id);
		cOne.setCustomerName(name);
		cOne.setCustomerCity(city);
		
		System.out.println(cOne);
		
		// call using parameterized constructor
		Customer cTwo = new Customer(id,name,city);
		System.out.println(cTwo);
	}

}
