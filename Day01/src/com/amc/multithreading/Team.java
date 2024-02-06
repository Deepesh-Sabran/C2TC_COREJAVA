package com.amc.multithreading;

public class Team implements Runnable{
	CakeCounter counter;
	Team(CakeCounter counter) {
		this.counter = counter;
	}
	// Runnable is a abstract method its only have one run() method
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<1000; i++) {
			counter.increment();
		}
	}
	
}
