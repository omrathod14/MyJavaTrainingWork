package com.aurionpro.Resturant.model;

public class Customer implements CustomerOperations {
	public void placeOrder() {
		System.out.println("Customer placed an order.");
	}

	public void trackOrder() {
		System.out.println("Customer is tracking the order.");
	}

	public void rateDriver() {
		System.out.println("Customer rated the driver.");
	}
}
