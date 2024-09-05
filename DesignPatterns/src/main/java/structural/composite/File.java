package structural.composite;

public class File implements FileSystemNode {

    private int size;

    public File(int size) {
        this.size = size;
    }

    public void changeSize(int delta) {
        size += delta;
    }

    @Override
    public int getSize() {
        return size;
    }
}
