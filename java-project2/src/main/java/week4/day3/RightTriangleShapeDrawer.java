package week4.day3;

import java.io.IOException;

public class RightTriangleShapeDrawer extends ShapeDrawer2{

    @Override
    public String makeALine(int height, int n) {
        return String.format("%s%s\n", "", "*".repeat(n));
    }

    public static void main(String[] args) throws IOException {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer();
        rightTriangle.printShape(new ConsolePrinter(), 5);
    }
}
