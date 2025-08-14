package com.Abstractmodel.model;

public abstract class Customer {
	String name;
	int unitsConsumed;

	public Customer(String name, int unitsconsumed) {
		this.name = name;
		this.unitsConsumed = unitsconsumed;
	}

	public String getname() {
		return name;
	}

	public abstract double Calculatebill();

}
