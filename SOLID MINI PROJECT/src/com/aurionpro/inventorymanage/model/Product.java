package com.aurionpro.inventorymanage.model;

public class Product {
    String name;
    int stock;
    int reorderLimit;
    double pricePerUnit;

    public Product(String name, int stock, int reorderLimit, double pricePerUnit) {
        this.name = name;
        this.stock = stock;
        this.reorderLimit = reorderLimit;
        this.pricePerUnit = pricePerUnit;
    }
}

