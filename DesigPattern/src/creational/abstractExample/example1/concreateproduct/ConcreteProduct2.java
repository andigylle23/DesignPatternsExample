package creational.abstractExample.example1.concreateproduct;
import creational.abstractExample.example1.abstractproduct.AbstractProduct2;

public class ConcreteProduct2  extends AbstractProduct2 {
    public ConcreteProduct2(String productName) {
        super(productName);
    }

    @Override
    public void run() {
        System.out.println(productName + " 完成(AbstractProduct2: run)");
    }
}
