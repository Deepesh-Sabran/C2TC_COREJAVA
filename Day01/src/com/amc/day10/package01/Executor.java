package com.amc.day10.package01;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne = new Base();
		// bOne.methodPrivate();    No visibility
		bOne.methodDefault();
		bOne.methodProtected();
		bOne.methodPublic();
	}
}
