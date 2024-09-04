package structural.adapter;

public class Adapter implements LegacyInterface {

    NewImplementation newImplementation = new NewImplementation();

    @Override
    public String get_first_name() {
        return newImplementation.getFirstName();
    }

    @Override
    public String get_last_name() {
        return newImplementation.getLastName();
    }
}
