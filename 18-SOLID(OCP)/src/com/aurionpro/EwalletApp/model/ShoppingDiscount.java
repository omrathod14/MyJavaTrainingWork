package com.aurionpro.EwalletApp.model;

public class ShoppingDiscount implements IDiscountStrategy {
	public double calculateDiscount(double amount) {
		return 50;
	}
}
