package creational.abstractExample.example1.abstractproduct;

/**
 * Abstract factory for creational.abstractExample.product 1
 * with a method to call `execute`
 */
public abstract class AbstractProduct1 {
    // protected parameter
    protected String productName;

    /**
     * abstractproduct.AbstractProduct1
     * @param productName
     */
    public AbstractProduct1(String productName) {
        this.productName = productName;
    }

    // method to call
    public abstract void execute();
}
