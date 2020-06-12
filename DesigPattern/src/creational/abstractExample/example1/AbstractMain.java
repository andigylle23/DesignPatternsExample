package creational.abstractExample.example1;

import creational.abstractExample.example1.abstractFactory.AbstractFactory;
import creational.abstractExample.example1.abstractproduct.AbstractProduct1;
import creational.abstractExample.example1.abstractproduct.AbstractProduct2;
import creational.abstractExample.example1.abstractproduct.AbstractProduct3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AbstractMain {
    public static void main(String[] args){
        // initialize abstract factory
        List<AbstractFactory> factories = new ArrayList<AbstractFactory>();

        // Add the concrete factory
        factories.add(AbstractFactory.createFactory());
        // Iterate the added factories
        Iterator<AbstractFactory> it = factories.iterator();

        // Initialize new abstract factory based on length of the factories added
        AbstractFactory factory = it.next();

        // Assign to new parameter the productname that it gets from creational.abstractExample.example1.concreateFactory.ConcreteFactory
        AbstractProduct1 product1 = factory.createProduct1();
        AbstractProduct2 product2 = factory.createProduct2();
        AbstractProduct3 product3 = factory.createProduct3();

        // Execute the method from AbstractProduct where it was overridden in ConcreteProduct
        product1.execute();
        product2.run();
        product3.action();
    }
}
