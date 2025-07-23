package com.Transport.model;

public class Truck implements VehicleControl {
	public void start() {
		System.out.println("Truck started.");
	}

	public void stop() {
		System.out.println("Truck stopped.");
	}

	public void changeGear(int gear) {
		System.out.println("Truck gear changed to: " + gear);
	}

	public String getVehicleType() {
		return "Truck";
	}
}
