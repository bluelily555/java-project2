package week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {
    //sout --> consol
    //bufferedwriter --> console, file

    private Printer printer;

    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    public String makeALine(int h, int i) {
        return String.format("%s\n", "*".repeat(i));
    }

    public void printToFile(String[] lines)throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("./aaa.txt"));
        for (int i = 0; i < lines.length; i++) {
            bw.append(lines[i]);
        }
        bw.flush();
        bw.close();
    }

    public void printToConsole(String[] lines){
        for (int i = 0; i < lines.length; i++) {
            System.out.printf("%s", lines[i]);
        }
    }
    public void printShape(int height) throws IOException {
        String [] lines = new String[height];
        for (int i = 0; i < height; i++) {
            lines[i] = makeALine(height, i + 1);
        }
        printer.print(lines);
        printToFile(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());
        rtp.printShape(7);
    }
}
