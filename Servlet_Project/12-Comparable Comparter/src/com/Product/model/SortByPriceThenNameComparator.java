package com.Product.model;

import java.util.Comparator;

public class SortByPriceThenNameComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		int priceCompare = Double.compare(p1.price, p2.price);
		if (priceCompare == 0) {
			return p1.name.compareToIgnoreCase(p2.name); // sort by name if same price
		} else {
			return priceCompare;
		}
	}
}
