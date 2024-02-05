package com.amc.day14.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = "Hello";
		String s = new String("Hello");
		
		System.out.println(str == str1);
		System.out.println(str == s);
		System.out.println(str.equals(s));
		System.out.println(str.concat(s));
	}

}
