package com.Abstractmodel.model;

public class Circle extends Shape {
    public Circle() {
        super("Circle");
    }

    public void draw() {
        System.out.println("Drawing " + shapeName + "...");
    }
}

