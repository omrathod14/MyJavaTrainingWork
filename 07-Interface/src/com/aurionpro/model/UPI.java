package com.aurionpro.model;

public class UPI implements PaymentGateway {
	public void pay(double amount) {
		System.out.println("Paid Rs" + amount + " via UPI.");
	}

	public void refund(double amount) {
		System.out.println("Refunded Rs" + amount + " via UPI.");
	}

	public String getMethodName() {
		return "UPI";
	}
}
