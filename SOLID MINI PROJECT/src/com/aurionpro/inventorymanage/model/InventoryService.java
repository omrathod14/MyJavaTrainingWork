package com.aurionpro.inventorymanage.model;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
	List<Product> products = new ArrayList<>();
	List<INotifier> notifiers;
	ReorderService reorderService;
	IValuationStrategy valuationStrategy;

	public InventoryService(List<INotifier> notifiers, ReorderService reorderService,
			IValuationStrategy valuationStrategy) {
		this.notifiers = notifiers;
		this.reorderService = reorderService;
		this.valuationStrategy = valuationStrategy;
	}

	public void addProduct(Product p) {
		products.add(p);
	}

	public void removeStock(String productName, int quantity) {
		for (Product p : products) {
			if (p.name.equalsIgnoreCase(productName)) {
				p.stock -= quantity;
				System.out.println("Removed " + quantity + " units of " + p.name);
				System.out.println("Current stock: " + p.stock);

				if (p.stock < p.reorderLimit) {
					System.out.println("Low stock! Reordering...");
					reorderService.reorder(p);
					for (INotifier n : notifiers) {
						n.send("Low stock alert for " + p.name);
					}
				}
			}
		}
	}

	public void showInventoryValue() {
		double value = valuationStrategy.calculateValue(products);
		System.out.println("Total inventory value: ₹" + value);
	}
}
