package behavioral.iterator;

import java.util.Random;

public class Element {
    static Random rand = new Random();

    @Override
    public String toString() {
        return "Element{" +
                "element='" + rand.nextInt() + '\'' +
                '}';
    }
}
