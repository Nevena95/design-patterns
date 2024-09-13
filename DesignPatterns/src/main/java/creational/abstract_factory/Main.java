package creational.abstract_factory;

import creational.abstract_factory.type1.Factory1;
import creational.abstract_factory.type2.Factory2;

// for building whole families of related products
public class Main {
    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        factory1.createProductA().execute();
        factory1.createProductB().execute();

        Factory factory2 = new Factory2();
        factory2.createProductA().execute();
        factory2.createProductB().execute();
    }
}
