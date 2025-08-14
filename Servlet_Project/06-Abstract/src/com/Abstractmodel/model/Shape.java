package com.Abstractmodel.model;

public abstract class Shape {
	protected String shapeName;

	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	public abstract void draw();
}
