package com.Abstractmodel.model;

public class Archer extends Gamecharacter {
	public Archer(String name, int powerLevel) {
		super(name, powerLevel);
	}

	public void attack() {
		powerLevel -= 5;
		System.out.println(name + " attacks! Power reduced by 5.");
	}
}
