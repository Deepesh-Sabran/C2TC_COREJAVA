package com.amc.day10.package02;

import com.amc.day10.package01.Base;

public class Executor2 extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne = new Base();
//		bOne.methodDefault(); not accesible outside the package
		Executor2 ex = new Executor2();
		ex.methodProtected();
		bOne.methodPublic();
	}
}
