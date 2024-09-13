package creational.abstract_factory.type2;

import creational.abstract_factory.Factory;
import creational.abstract_factory.ProductA;
import creational.abstract_factory.ProductB;

public class Factory2 implements Factory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
