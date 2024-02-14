package com.amc.generics;

public class SenderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender<String> stringSender = new Sender<>();
		stringSender.setMessage("I am Devil !!");
		stringSender.sendMessage();
		
		Sender<Person> personSender = new Sender<>();
		personSender.setMessage(new Person("Deepesh", "Bangalore"));
		personSender.sendMessage();
	}

}
