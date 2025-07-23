package com.aurionpro.Vehicle.model;

public abstract class Vehicle {
	String name;

	public Vehicle(String name) {
		this.name = name;
	}

	public abstract void start();
}
