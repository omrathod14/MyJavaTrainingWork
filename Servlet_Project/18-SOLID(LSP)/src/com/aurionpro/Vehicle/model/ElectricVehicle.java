package com.aurionpro.Vehicle.model;

public abstract class ElectricVehicle extends Vehicle {

	public ElectricVehicle(String name) {
		super(name);
	}

	public abstract void charge();
}
