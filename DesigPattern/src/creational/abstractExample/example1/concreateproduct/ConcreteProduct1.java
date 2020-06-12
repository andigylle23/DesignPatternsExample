package creational.abstractExample.example1.concreateproduct;
import creational.abstractExample.example1.abstractproduct.AbstractProduct1;

public class ConcreteProduct1 extends AbstractProduct1{
    public ConcreteProduct1(String productName) {
        super(productName);
    }

    @Override
    public void execute(){
        System.out.println(productName + " 完成(AbstractProduct: execute)");
    }
}
