package com.Abstractmodel.model;

public class Triangle extends Shape {
    public Triangle() {
        super("Triangle");
    }

    public void draw() {
        System.out.println("Drawing " + shapeName + "...");
    }
}

