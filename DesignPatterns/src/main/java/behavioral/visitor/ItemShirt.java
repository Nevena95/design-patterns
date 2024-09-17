package behavioral.visitor;

public class ItemShirt implements Item {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return 50.1d;
    }

    public int size() {
        return 2;
    }
}
