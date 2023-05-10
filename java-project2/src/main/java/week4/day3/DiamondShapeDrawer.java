package week4.day3;

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

    public static void main(String[] args) {
        ShapeDrawer2 dpd = new DiamondShapeDrawer();
        dpd.printShape(9);
    }
}
