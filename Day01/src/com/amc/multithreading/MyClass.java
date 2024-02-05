package com.amc.multithreading;

public class MyClass extends Thread{
	private int n;
	private String msg;
	
	public MyClass(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}
	
	public void run() {
		for(int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				System.out.println("Thread is Interrupted"+e.getMessage());
			}
			System.out.println(msg+" "+i+" "+Thread.currentThread().getName());
		}
	}
}
