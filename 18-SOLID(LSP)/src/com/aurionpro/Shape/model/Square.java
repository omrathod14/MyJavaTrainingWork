package com.aurionpro.Shape.model;

public class Square implements IShape {

	protected double side;

	public Square(double side) {

		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;
	}

}
