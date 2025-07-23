package com.aurionpro.Resturant.model;

public class RestaurantTest {
	public static void main(String[] args) {
		CustomerOperations customer = new Customer();
		customer.placeOrder();
		customer.trackOrder();
		customer.rateDriver();

		DeliveryOperations deliveryGuy = new DeliveryPerson();
		deliveryGuy.trackOrder();

		RestaurantOperations owner = new RestaurantOwner();
		owner.manageRestaurant();
	}
}
