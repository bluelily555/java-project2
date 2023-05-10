package week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer{
    @Override
    public void print(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./file.txt"));
        for (int i = 0; i < lines.length; i++) {
            bw.write(lines[i]);
            bw.flush();
        }
        bw.close();
    }
}
