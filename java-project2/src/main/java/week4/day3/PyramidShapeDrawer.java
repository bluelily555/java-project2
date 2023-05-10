package week4.day3;

public class PyramidShapeDrawer extends ShapeDrawer2{
    @Override
    public String makeALine(int height, int n) {
        return String.format("%s%s\n", "0".repeat(height-n-1), "*".repeat(n*2+1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 pd = new PyramidShapeDrawer();
        pd.printShape(7);
    }
}
