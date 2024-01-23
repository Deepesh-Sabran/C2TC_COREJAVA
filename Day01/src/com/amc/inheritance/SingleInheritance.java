package com.amc.inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		Student s = new Student(123456789L, 12456, "Bangalore", 21, "MCA");
		System.out.println(s);
		Citizen c = new Citizen(123456789L, 12456, "Bangalore");
		System.out.println(c);
	}

}
