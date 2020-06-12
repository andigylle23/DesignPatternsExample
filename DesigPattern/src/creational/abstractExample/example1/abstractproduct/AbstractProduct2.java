package creational.abstractExample.example1.abstractproduct;

/**
 * Abstract factory for creational.abstractExample.product 2
 * with a method to call `run`
 */
public abstract class AbstractProduct2 {
    // protected parameter
    protected  String productName;

    /**
     * abstractproduct.AbstractProduct2
     * @param productName
     */
    public AbstractProduct2(String productName) {
        this.productName = productName;
    }

    // method to call
    public abstract void run();
}
