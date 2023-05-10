package week4.day3;

import java.io.IOException;

public class DiamondShapeDrawer extends ShapeDrawer2{
    @Override
    public String makeALine(int height, int n) {
        String result = "";

        int pivot = height / 2;

        if(n < height / 2){
            return String.format("%s%s\n", " ".repeat(pivot - n), "*".repeat(2 * n + 1));
        } else {
            return String.format("%s%s\n", " ".repeat(n - pivot), "*".repeat(2 * (height - n) - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer2 dpd = new DiamondShapeDrawer();
        dpd.printShape(new ConsolePrinter(),9);
    }
}
