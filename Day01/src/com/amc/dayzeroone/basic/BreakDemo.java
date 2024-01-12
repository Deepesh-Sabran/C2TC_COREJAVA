package com.amc.dayzeroone.basic;

public class BreakDemo {

	public static void main(String[] args) {
		int i;
		for(i = 5; i < 10; i++) {
			if(i==5)
				continue;
			System.out.println("the elements are : " + i);
		}
//		System.out.println("the elements are : " + i);
	}

}
