package behavioral.visitor;

public class ItemHandCream implements Item {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return 12.5d;
    }

    public double weight() {
        return 1.2d;
    }
}
