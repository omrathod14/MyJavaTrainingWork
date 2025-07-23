package com.OOPs.model;

public class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double CalArea(double radius) {
		double area = 0;
		area = 3.14 * radius * radius;

		return area;
	}

}
