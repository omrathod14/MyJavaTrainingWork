package com.Product.model;

public class Product {
	String category;
	String name;
	double price;

	public Product(String category, String name, double price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "Category: " + category + ", Name: " + name + ", Price: ₹" + price;
	}
}
