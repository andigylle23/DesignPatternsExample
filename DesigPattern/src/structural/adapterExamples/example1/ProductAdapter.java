package structural.adapterExamples.example1;

public class ProductAdapter implements   ProductPrice {
    private Product product = new Product();
    public int getPrice() {
        return product.getCost();
    }
}
