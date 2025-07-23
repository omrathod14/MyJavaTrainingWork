package com.aurionpro.Ecommerce.solution.model;

public class PriceCalculator {
	public double getFinalPrice(Product product, double discount) {
		return product.price - discount;
	}
}
