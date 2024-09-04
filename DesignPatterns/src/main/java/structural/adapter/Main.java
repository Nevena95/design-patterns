package structural.adapter;

public class Main {

    public static void main(String[] args) {
        LegacyInterface newImpl = new Adapter();

        System.out.println(newImpl.get_first_name());
        System.out.println(newImpl.get_last_name());
    }

}
