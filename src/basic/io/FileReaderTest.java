package basic.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        FileReader fr = new FileReader("src/datafile/test.txt");

        while (true) {
            int str = fr.read();

            if (str == -1) {
                break;
            }

            System.out.print((char) str);
        }
    }
}