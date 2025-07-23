package com.aurionpro.Vehicle.model;

public class PetrolCar extends FuelVehicle {

	public PetrolCar(String name) {
		super(name);
	}

	@Override
	public void start() {
		System.out.println(name + " started with petrol engine.");
	}

	@Override
	public void refuel() {
		System.out.println(name + " is refueling at petrol station.");
	}
}
