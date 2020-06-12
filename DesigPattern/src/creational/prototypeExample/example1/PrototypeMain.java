package creational.prototypeExample.example1;

public class PrototypeMain {
    private PrototypeFactory prototype;

    public PrototypeMain(PrototypeFactory prototype) {
        this.prototype = prototype;
    }

    public PrototypeFactory makeCopy() throws CloneNotSupportedException {
        return (PrototypeFactory) this.prototype.clone();
    }

    public static void main(String args[]) {
        try {
            PrototypeFactory tempExample = null;
            int num = 1000;
            PrototypeFactory proto = new PrototypeImpl(1000);
            PrototypeMain cm = new PrototypeMain(proto);
            for (int i = 0; i < 10; i++) {
                tempExample = cm.makeCopy();
                tempExample.prototypeFactory(i * num);
                tempExample.printValue();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
