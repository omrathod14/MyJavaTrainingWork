package com.aurionpro.Shape.model;

public class Reactangle implements IShape {

	protected int length;
	protected int breadth;


	public Reactangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public double getArea() {
		return length * breadth;
	}

}
