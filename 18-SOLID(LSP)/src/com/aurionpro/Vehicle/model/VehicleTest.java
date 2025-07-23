package com.aurionpro.Vehicle.model;

public class VehicleTest {
    public static void main(String[] args) {
        FuelVehicle car = new PetrolCar("Honda City");
        car.start();
        car.refuel();

        ElectricVehicle ev = new ElectricCar("Tesla");
        ev.start();
        ev.charge();
    }
}
