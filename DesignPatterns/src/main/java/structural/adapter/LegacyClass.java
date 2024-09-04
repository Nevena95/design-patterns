package structural.adapter;

public class LegacyClass implements LegacyInterface {
    @Override
    public String get_first_name() {
        return "Legacy first name";
    }

    @Override
    public String get_last_name() {
        return "Legacy last name";
    }
}
