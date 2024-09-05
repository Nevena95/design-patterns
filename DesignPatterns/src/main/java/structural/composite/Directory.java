package structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Directory implements FileSystemNode {

    private final List<FileSystemNode> children = new LinkedList<>();

    public void insert(FileSystemNode child) {
        children.add(child);
    }

    @Override
    public int getSize() {
        int size = 0;

        for (FileSystemNode child : children) {
            size += child.getSize();
        }

        return size;
    }
}
