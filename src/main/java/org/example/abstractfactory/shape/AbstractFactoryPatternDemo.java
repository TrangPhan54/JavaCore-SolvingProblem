package org.example.abstractfactory.shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory factory1 = ShapeFactory.FactoryProducer.getFactory(false);
        Shape shape1 = factory1.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = factory1.getShape("SQUARE");
        shape2.draw();
        AbstractFactory factory2 = ShapeFactory.FactoryProducer.getFactory(true);
        Shape shape3 = factory2.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = factory2.getShape("SQUARE");
        shape4.draw();
    }
}