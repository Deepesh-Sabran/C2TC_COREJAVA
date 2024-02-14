package com.amc.generics;

public class GenericTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTest<Integer> obj = new GenericTest<>();
		obj.add(10);
		System.out.println(obj.get());
		GenericTest<String> obj1 = new GenericTest<>();
		obj1.add("Devil");
		System.out.println(obj1.get());
	}

}
