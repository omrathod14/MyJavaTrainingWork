package com.aurionpro.inventorymanage.model;

import java.util.List;

public class FIFOValuation implements IValuationStrategy {
    public double calculateValue(List<Product> products) {
        double total = 0;
        for (Product p : products) {
            total += p.stock * p.pricePerUnit;
        }
        return total;
    }
}

