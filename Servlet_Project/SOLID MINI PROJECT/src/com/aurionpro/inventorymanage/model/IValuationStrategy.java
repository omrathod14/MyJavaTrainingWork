package com.aurionpro.inventorymanage.model;

import java.util.List;

public interface IValuationStrategy {
    double calculateValue(List<Product> products);
}
