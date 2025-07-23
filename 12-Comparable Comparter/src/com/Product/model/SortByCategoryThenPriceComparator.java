package com.Product.model;

import java.util.Comparator;

public class SortByCategoryThenPriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        int categoryCompare = p1.category.compareToIgnoreCase(p2.category);
        if (categoryCompare == 0) {
            return Double.compare(p1.price, p2.price); // sort by price within same category
        } else {
            return categoryCompare;
        }
    }
}

