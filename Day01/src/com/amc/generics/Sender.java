package com.amc.generics;

public class Sender<T> {
	T message;
	public void setMessage(T message) {
		this.message = message;
	}
	
	public void sendMessage() {
		System.out.println(message);
	}
}
