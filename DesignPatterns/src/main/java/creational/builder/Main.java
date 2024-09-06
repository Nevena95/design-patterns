package creational.builder;

public class Main {

    public static void main(String[] args) {
        ComplexObject.Builder builder = ComplexObject.getBuilder();

        ComplexObject object = builder.withA("A")
                                .withB("B")
                                .withC("C")
                                .withD("D")
                                .withE("E")
                                .withF("F")
                                .build();

        System.out.println(object);
    }
}
