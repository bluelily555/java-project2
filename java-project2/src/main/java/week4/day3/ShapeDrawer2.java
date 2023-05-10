package week4.day3;

import java.io.IOException;

public abstract class ShapeDrawer2 {
    Printer printer;

    public abstract String makeALine(int height, int n);

    public void printShape(Printer printer, int height) throws IOException{
        this.printer = printer;
        String[] lines = new String[height];
        for (int i = 0; i < height; i++) {
            lines[i] = makeALine(height, i);
        }
        this.printer.print(lines);
    }
}
