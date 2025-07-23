package com.aurionpro.Ecommerce.solution.model;

public class ProductPrinter {
	public void print(Product product) {
		System.out.println("Product: " + product.name);
		System.out.println("Price: ₹" + product.price);
	}
}