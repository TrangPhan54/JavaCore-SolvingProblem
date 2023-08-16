package org.example.abstractfactory.shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    public static class FactoryProducer {
        public static AbstractFactory getFactory(boolean rounded){
            if(rounded){
                return new RoundedShapeFactory();
            }
            else {
                return new ShapeFactory();
            }
        }
    }
}
