package com.Ecommerce.model;

public class CreditCard implements PaymentGateway {
	public void pay(double amount) {
		System.out.println("Paid Rs" + amount + " using Credit Card.");
	}

	public void refund(double amount) {
		System.out.println("Refunded Rs" + amount + " to Credit Card.");
	}

	public String getMethodName() {
		return "Credit Card";
	}
}
