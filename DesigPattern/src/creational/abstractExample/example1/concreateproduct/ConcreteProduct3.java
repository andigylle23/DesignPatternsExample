package creational.abstractExample.example1.concreateproduct;
import creational.abstractExample.example1.abstractproduct.AbstractProduct3;

public class ConcreteProduct3 extends AbstractProduct3 {
    public ConcreteProduct3(String productName) {
        super(productName);
    }

    @Override
    public void action(){
        System.out.println(productName + " 完成(AbstractProduct3: action)");
    }
}
