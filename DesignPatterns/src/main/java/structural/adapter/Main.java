package structural.adapter;


/**
 *  Usage:
 *  When there is legacy system, and we want to reuse it and adapt it to new functionality.
 */
public class Main {

    public static void main(String[] args) {
        LegacyInterface newImpl = new Adapter();

        System.out.println(newImpl.get_first_name());
        System.out.println(newImpl.get_last_name());
    }

}
