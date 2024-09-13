package structural.proxy.lazy_loading;

public class BigSizeImage implements Image {
    private final String fileName;

    public BigSizeImage(String fileName) {
        this.fileName = fileName;

        loadImage();
    }

    private void loadImage() {
        // very expensive loading
        System.out.println("Loading image " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + fileName);
    }
}
