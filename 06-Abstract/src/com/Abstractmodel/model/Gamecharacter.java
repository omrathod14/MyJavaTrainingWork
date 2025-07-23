package com.Abstractmodel.model;

public abstract class Gamecharacter {
	protected String name;
	protected int powerLevel;

	public Gamecharacter(String name, int powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel;
	}

	public String getName() {
		return name;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public abstract void attack();
}
