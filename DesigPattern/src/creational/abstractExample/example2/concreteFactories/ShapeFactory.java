package creational.abstractExample.example2.concreteFactories;

import creational.abstractExample.example2.AbstractFactory;
import creational.abstractExample.example2.Shape;
import creational.abstractExample.example2.concreteShapes.Circle;
import creational.abstractExample.example2.concreteShapes.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
