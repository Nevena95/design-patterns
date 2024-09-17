package behavioral.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(ItemHandCream itemHandCream) {
        double commission = 1.2d;
        double price = itemHandCream.getPrice() * commission * itemHandCream.weight();
        System.out.println("Calculated price for hand cream is " + price);
    }

    @Override
    public void visit(ItemShirt itemShirt) {
        double discount = 0.95d;
        double price = itemShirt.getPrice() * discount * itemShirt.size();
        System.out.println("Calculated price for shirt is " + price);
    }
}
