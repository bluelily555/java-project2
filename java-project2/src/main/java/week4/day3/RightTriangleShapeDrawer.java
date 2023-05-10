package week4.day3;

public class RightTriangleShapeDrawer extends ShapeDrawer2{

    @Override
    public String makeALine(int height, int n) {
        return String.format("%s%s\n", "", "*".repeat(n));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer();
        rightTriangle.printShape(5);
    }
}
