package creational.abstractExample.example2.concreteFactories;


import creational.abstractExample.example2.AbstractFactory;
import creational.abstractExample.example2.Shape;
import creational.abstractExample.example2.concreteShapes.RoundedCircle;
import creational.abstractExample.example2.concreteShapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new RoundedCircle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
