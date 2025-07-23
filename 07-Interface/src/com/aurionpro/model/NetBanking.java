package com.aurionpro.model;

public class NetBanking implements PaymentGateway {
	public void pay(double amount) {
		System.out.println("Paid Rs" + amount + " using Net Banking.");
	}

	public void refund(double amount) {
		System.out.println("Refunded Rs" + amount + " via Net Banking.");
	}

	public String getMethodName() {
		return "Net Banking";
	}
}
