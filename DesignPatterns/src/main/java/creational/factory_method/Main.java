package creational.factory_method;

public class Main {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();

        product.execute();
    }
}
