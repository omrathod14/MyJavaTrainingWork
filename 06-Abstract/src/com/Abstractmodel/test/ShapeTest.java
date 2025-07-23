package com.Abstractmodel.test;

import com.Abstractmodel.model.Circle;
import com.Abstractmodel.model.Shape;
import com.Abstractmodel.model.Square;
import com.Abstractmodel.model.Triangle;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

