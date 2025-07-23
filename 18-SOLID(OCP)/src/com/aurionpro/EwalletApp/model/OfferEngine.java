package com.aurionpro.EwalletApp.model;

public class OfferEngine {
	private IDiscountStrategy strategy;

	public OfferEngine(IDiscountStrategy strategy) {
		this.strategy = strategy;
	}

	public double applyOffer(double amount) {
		return amount - strategy.calculateDiscount(amount);
	}
}
