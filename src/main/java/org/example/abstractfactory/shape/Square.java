package org.example.abstractfactory.shape;

import org.example.abstractfactory.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a square");
    }
}
