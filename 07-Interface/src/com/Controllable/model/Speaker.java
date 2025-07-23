package com.Controllable.model;

public class Speaker implements Controllable {
	public void turnOn() {
		System.out.println("Speaker turned ON");
	}

	public void setMode(String mode) {
		System.out.println("Speaker mode set to: " + mode);
	}

	public void turnOff() {
		System.out.println("Speaker turned OFF");
	}
}
