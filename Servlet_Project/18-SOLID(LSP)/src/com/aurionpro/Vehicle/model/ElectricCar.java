package com.aurionpro.Vehicle.model;

public class ElectricCar extends ElectricVehicle {

    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " started silently with battery.");
    }

    @Override
    public void charge() {
        System.out.println(name + " is charging at electric station.");
    }
}

