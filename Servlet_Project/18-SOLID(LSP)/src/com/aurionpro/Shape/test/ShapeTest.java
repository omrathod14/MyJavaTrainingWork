package com.aurionpro.Shape.test;

import com.aurionpro.Shape.model.Circle;
import com.aurionpro.Shape.model.IShape;

public class ShapeTest {
	public static void main(String[] args) {

		IShape shape = new Circle(3);
		System.out.println("Area:" + shape.getArea());
	}
}
