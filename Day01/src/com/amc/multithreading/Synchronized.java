package com.amc.multithreading;

public class Synchronized {
	static CakeCounter counter = new CakeCounter();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread team1 = new Thread(new Team(counter));
		Thread team2 = new Thread(new Team(counter));
		
		team1.start();
		team2.start();
		
		try {
			// both are using shared resource so we need to join them
			team1.join();
			team2.join();
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(counter.cakeCount);
	}

}
