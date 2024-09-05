package structural.composite;


/**
 *  USAGE:
 *  To treat simple and composite objects on the same way.
 */
public class Main {

    public static void main(String[] args) {

        FileSystemNode file1 = new File(12);
        FileSystemNode file2 = new File(5);
        FileSystemNode file3 = new File(10);

        Directory directory1 = new Directory();
        directory1.insert(file1);
        directory1.insert(file2);

        Directory directory2 = new Directory();
        directory2.insert(file3);

        directory1.insert(directory2);

        System.out.println(directory1.getSize());
    }
}
