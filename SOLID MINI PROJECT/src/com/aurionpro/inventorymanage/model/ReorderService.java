package com.aurionpro.inventorymanage.model;

public class ReorderService {
	public void reorder(Product product) {
		product.stock += 20;
		System.out.println("Reorder placed for 20 units of " + product.name);
	}
}
