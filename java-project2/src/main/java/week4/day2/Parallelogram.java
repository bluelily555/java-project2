package week4.day2;

public class Parallelogram {
    String spaceChar = "0";

    public Parallelogram(String spaceChar){
        this.spaceChar = spaceChar;
    }
    public String makeALine(int height, int i, String shape){

        if(shape.equals("역피라미드")) {
            return String.format("%s%s\n", spaceChar. repeat(i),"*".repeat(2 * (height - i) - 1));
        } else {
            return String.format("%s%s\n", spaceChar. repeat(height - i),"*".repeat(height));
        }
    }
    public static void main(String[] args) {
        Parallelogram rPyramid = new Parallelogram(" ");
        int height = 5;

        for (int i = 0; i < height; i++) {
            System.out.print(rPyramid.makeALine(height, i, "역피라미드"));
        }
        for (int i = 0; i < height; i++) {
            System.out.print(rPyramid.makeALine(height, i, "평행사변형"));
        }
    }
}
