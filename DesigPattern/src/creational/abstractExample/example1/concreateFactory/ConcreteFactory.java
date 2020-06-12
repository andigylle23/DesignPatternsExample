package creational.abstractExample.example1.concreateFactory;

import creational.abstractExample.example1.abstractFactory.AbstractFactory;
import creational.abstractExample.example1.abstractproduct.AbstractProduct1;
import creational.abstractExample.example1.abstractproduct.AbstractProduct2;
import creational.abstractExample.example1.abstractproduct.AbstractProduct3;
import creational.abstractExample.example1.concreateproduct.ConcreteProduct1;
import creational.abstractExample.example1.concreateproduct.ConcreteProduct2;
import creational.abstractExample.example1.concreateproduct.ConcreteProduct3;

public class ConcreteFactory extends AbstractFactory {

    @Override
    public AbstractProduct1 createProduct1() { return new ConcreteProduct1("抽象的工場例-1:ConcreteFactory");}
    @Override
    public AbstractProduct2 createProduct2() { return new ConcreteProduct2("抽象的工場例-2:ConcreteFactory");}
    @Override
    public AbstractProduct3 createProduct3() {
        return new ConcreteProduct3("抽象的工場例-3:ConcreteFactory");
    }
}
