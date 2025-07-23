package com.Transport.model;

public class Car implements VehicleControl {
	public void start() {
		System.out.println("Car started.");
	}

	public void stop() {
		System.out.println("Car stopped.");
	}

	public void changeGear(int gear) {
		System.out.println("Car gear changed to: " + gear);
	}

	public String getVehicleType() {
		return "Car";
	}
}
