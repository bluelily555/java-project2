package week4.day2;

public class Parallelogram {
    String spaceChar = "0";

    String shape = "parallelogram";

    public Parallelogram(String spaceChar){
        this.spaceChar = spaceChar;
    }
    public String makeALine(int height, int i, String shape){
        int spaceRepeat = 0;
        int starRepeat = 0;

        if(shape.equals("역피라미드")) {
            spaceRepeat = i;
            starRepeat = (2 * (height - i) - 1);
        }
        else if(shape.equals("평행사변형")) {
            spaceRepeat = height - i;
            starRepeat = height;
        }
        return String.format("%s%s\n", spaceChar. repeat(spaceRepeat),"*".repeat(starRepeat));
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
