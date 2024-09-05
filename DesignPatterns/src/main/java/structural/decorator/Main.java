package structural.decorator;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/**
 *  OutputStream -> FileOutputStream
 *               -> DataOutputStream
 *
 *  DataOutputStream contains FileOutputStream (decorates it).
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);  // decorator for file output stream

        // both are extended from class OutputStream
    }
}
