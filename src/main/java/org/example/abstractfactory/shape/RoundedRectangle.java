package org.example.abstractfactory.shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a rounded rectangle");
    }
}
