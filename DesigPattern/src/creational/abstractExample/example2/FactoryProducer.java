package creational.abstractExample.example2;

import creational.abstractExample.example2.concreteFactories.RoundedShapeFactory;
import creational.abstractExample.example2.concreteFactories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
