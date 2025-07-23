package com.aurionpro.EwalletApp.model;

public class BillPaymentDiscount implements IDiscountStrategy {
	public double calculateDiscount(double amount) {
		return amount * 0.05;
	}
}
