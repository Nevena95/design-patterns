package behavioral.visitor;

/**
 * Usage: to avoid code like
 *        if (a is ConcreteClass1) {...}
 *        else if (a is ConcreteClass2) {...}
 * without writing virtual methods.
 */

public interface Visitor {

    void visit(ItemHandCream itemHandCream);

    void visit(ItemShirt itemShirt);
}
