package com.Controllable.model;


public class Light implements Controllable {
	public void turnOn() {
		System.out.println("Light turned ON");
	}

	public void setMode(String mode) {
		System.out.println("Light mode set to: " + mode);
	}

	public void turnOff() {
		System.out.println("Light turned OFF");
	}
}
