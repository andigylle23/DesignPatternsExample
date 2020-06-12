package creational.abstractExample.example1.abstractFactory;

import creational.abstractExample.example1.abstractproduct.AbstractProduct1;
import creational.abstractExample.example1.abstractproduct.AbstractProduct2;
import creational.abstractExample.example1.abstractproduct.AbstractProduct3;
import creational.abstractExample.example1.concreateFactory.ConcreteFactory;

public abstract class AbstractFactory {
    public static AbstractFactory createFactory(){
        return new ConcreteFactory();
    }
    public abstract AbstractProduct1 createProduct1();
    public abstract AbstractProduct2 createProduct2();
    public abstract AbstractProduct3 createProduct3();
}
