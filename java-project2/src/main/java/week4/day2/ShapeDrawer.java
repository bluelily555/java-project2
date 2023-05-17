package week4.day2;

public abstract class ShapeDrawer {
    public  abstract String makeALine(int height, int i);

    public void printShape(int height){
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
}