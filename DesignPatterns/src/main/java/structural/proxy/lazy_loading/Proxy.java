package structural.proxy.lazy_loading;

public class Proxy implements Image {
    private BigSizeImage instance;   // lazy loading
    private final String fileName;

    public Proxy(String fileName) {
        this.fileName = fileName;
        // instance will be loaded on first usage
    }

    @Override
    public void display() {
        if (instance == null) {
            instance = new BigSizeImage(fileName);
        }

        instance.display();
    }
}
