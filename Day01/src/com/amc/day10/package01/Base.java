package com.amc.day10.package01;

public class Base {
	private int varPrivate = 10;
	int varDefault = 20;
	protected int varProtected = 30;
	public int varPublic = 40;
	
	private void methodPrivate() {
		System.out.println("private variable : "+varPrivate);
	}
	
	void methodDefault() {
		System.out.println("default variable : "+varDefault);
	}
	
	protected void methodProtected() {
		System.out.println("protected variable : "+varProtected);
	}
	
	public void methodPublic() {
		System.out.println("public variable : "+varPublic);
	}
}
