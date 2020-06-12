package creational.abstractExample.example2.concreteShapes;


import creational.abstractExample.example2.Shape;

public class RoundedCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is a rounded circle");
    }
}
