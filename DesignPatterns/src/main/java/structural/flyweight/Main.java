package structural.flyweight;

/**
 *  Usage:
 *  Stateless objects, reusable.
 *  examples: Java String pool
 *  https://www.javatpoint.com/string-pool-in-java
 */
public class Main {

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println(s1.intern() == s2.intern());

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight f1 = flyweightFactory.getFlyweight("aaa");
        Flyweight f2 = flyweightFactory.getFlyweight("aaa");

        System.out.println(f1);
        System.out.println(f2);
    }
}
