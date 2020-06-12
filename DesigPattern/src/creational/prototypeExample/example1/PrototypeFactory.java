package creational.prototypeExample.example1;

public abstract class PrototypeFactory implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        // Call Object.clone()
        PrototypeFactory copy = (PrototypeFactory) super.clone();
        /**
         * In an actual implements of this pattern you  might now change
         * references to the expensive to produce parts from the copies
         * are held inside the prototype
         */
        return copy;
    }

    public abstract void prototypeFactory(int x);
    public abstract void printValue();
}
