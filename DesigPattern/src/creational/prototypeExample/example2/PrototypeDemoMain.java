package creational.prototypeExample.example2;

public class PrototypeDemoMain {

    public static void main(String[] args) {
        ShapeFactory.loadCache();

        Shape cloneCircle = (Shape) ShapeFactory.getShape("1");
        System.out.println("Shape: " + cloneCircle.getType());

        Shape cloneSquare = (Shape) ShapeFactory.getShape("2");
        System.out.println("Shape: " + cloneSquare.getType());

        Shape cloneRectangle = (Shape) ShapeFactory.getShape("3");
        System.out.println("Shape: " + cloneRectangle.getType());
    }
}
