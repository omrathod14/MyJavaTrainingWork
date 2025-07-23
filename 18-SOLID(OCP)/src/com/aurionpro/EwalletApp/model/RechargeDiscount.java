package com.aurionpro.EwalletApp.model;

public class RechargeDiscount implements IDiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		return amount * 0.10;
	}

}
