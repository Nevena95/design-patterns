package creational.singleton;

public class Singleton {
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();    // lazy loading and thread safe
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
