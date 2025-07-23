package com.Product.model;

import java.util.Comparator;

public class SortByNameThenCategoryComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		int nameCompare = p1.name.compareToIgnoreCase(p2.name);
		if (nameCompare == 0) {
			return p1.category.compareToIgnoreCase(p2.category); // sort by category if names same
		} else {
			return nameCompare;
		}
	}
}
