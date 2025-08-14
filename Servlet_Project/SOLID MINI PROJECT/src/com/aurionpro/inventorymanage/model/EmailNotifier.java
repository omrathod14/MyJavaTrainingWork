package com.aurionpro.inventorymanage.model;

public class EmailNotifier implements INotifier {
	public void send(String message) {
		System.out.println("EMAIL Alert!!! " + message);
	}
}
