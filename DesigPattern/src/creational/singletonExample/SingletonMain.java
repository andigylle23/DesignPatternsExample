package creational.singletonExample;

public class SingletonMain {
    public static void main(String[] args) {

        /**
         * illegal construct
         * compile time error: the constructor SingleObject() is not visible
         * SingleObject object = new SingleObject();
         */

        // Get the only object available
        SingletonObject object  = SingletonObject.getInstance();

        // Show message
        object.showMessage();
    }
}
