package week4.day3;

public abstract class ShapeDrawer2 {
    public abstract String makeALine(int height, int n);

    public void printShape(int height){
        for (int i = 0; i < height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }
}
