package behavioral.visitor;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Item> shoppingCart = new HashSet<>();
        shoppingCart.add(new ItemHandCream());
        shoppingCart.add(new ItemShirt());

        Visitor visitor = new VisitorImpl();

        for (Item item : shoppingCart) {
            item.accept(visitor);
        }
    }
}
