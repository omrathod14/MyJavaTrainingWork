package com.aurionpro.Shape.model;

public class Circle implements IShape {

	protected double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

}
