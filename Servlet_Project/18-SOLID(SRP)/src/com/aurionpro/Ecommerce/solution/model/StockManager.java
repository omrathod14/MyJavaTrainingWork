package com.aurionpro.Ecommerce.solution.model;

public class StockManager {
	int stock;

	public StockManager(int stock) {
		this.stock = stock;
	}

	public boolean isInStock() {
		return stock > 0;
	}

	public void reduceStock() {
		if (stock > 0) {
			stock--;
		}
	}
}
