package creational.abstract_factory.type1;

import creational.abstract_factory.Factory;
import creational.abstract_factory.ProductA;
import creational.abstract_factory.ProductB;

public class Factory1 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
