package creational.abstractExample.example1.abstractproduct;

/**
 * Abstract factory for creational.abstractExample.product 3
 * with a method to call `action`
 */
public abstract class AbstractProduct3 {
    // protected parameter
    protected String productName;

    /**
     * abstractproduct.AbstractProduct1
     * @param productName
     */
    public AbstractProduct3(String productName) {
        this.productName = productName;
    }

    // method to call
    public abstract void action();
}
