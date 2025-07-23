package com.Transport.model;

public class Bike implements VehicleControl {
	public void start() {
		System.out.println("Bike started.");
	}

	public void stop() {
		System.out.println("Bike stopped.");
	}

	public void changeGear(int gear) {
		System.out.println("Bike gear changed to: " + gear);
	}

	public String getVehicleType() {
		return "Bike";
	}
}
