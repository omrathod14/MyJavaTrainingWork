package com.Abstractmodel.model;

public class Square extends Shape {
	public Square() {
		super("Square");
	}

	public void draw() {
		System.out.println("Drawing " + shapeName + "...");
	}
}
