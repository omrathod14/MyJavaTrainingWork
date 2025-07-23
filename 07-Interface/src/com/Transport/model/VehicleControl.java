package com.Transport.model;

public interface VehicleControl {
	void start();

	void stop();

	void changeGear(int gear);

	String getVehicleType();
}
