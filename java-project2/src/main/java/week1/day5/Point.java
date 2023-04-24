package week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy(){
        return x == y;
    }

    public static void main(String[] args){
        Point p = new Point();
        System.out.println(p.x);
    }

}
