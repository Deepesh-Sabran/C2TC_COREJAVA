package com.amc.multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyClass(3, "First Thread");
		Thread t2 = new MyClass(5, "Second Thread");
		t1.start();
		t2.start();
	}

}
