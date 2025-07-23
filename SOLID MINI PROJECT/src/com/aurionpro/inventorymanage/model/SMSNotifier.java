package com.aurionpro.inventorymanage.model;

public class SMSNotifier implements INotifier {
	public void send(String message) {
		System.out.println("SMS Alert!!" + message);
	}
}
