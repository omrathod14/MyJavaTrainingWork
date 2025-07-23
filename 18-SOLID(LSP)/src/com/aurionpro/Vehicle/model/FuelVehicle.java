package com.aurionpro.Vehicle.model;

public abstract class FuelVehicle extends Vehicle {

    public FuelVehicle(String name) {
        super(name);
    }

    public abstract void refuel();
}
