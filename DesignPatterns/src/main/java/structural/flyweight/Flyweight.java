package structural.flyweight;


public class Flyweight {

    private final String name; // unique name
    private final int data;

    public Flyweight(String name, int data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public int getData() {
        return data;
    }
}
