package creational.prototypeExample.example1;

public class PrototypeImpl extends PrototypeFactory {
    int x;

    public PrototypeImpl(int x) {
        this.x = x;
    }

    @Override
    public void prototypeFactory(int x) {
        this.x = x;
    }

    public void printValue() {
        System.out.println("Value: " + x);
    }
}
