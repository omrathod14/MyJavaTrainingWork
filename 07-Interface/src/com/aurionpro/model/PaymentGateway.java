package com.aurionpro.model;

public interface PaymentGateway {
	void pay(double amount);

	void refund(double amount);

	String getMethodName();

}
