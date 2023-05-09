package week4.day2;

public class ReversePyramid {
    String spaceChar = "0";

    public ReversePyramid(String spaceChar){
        this.spaceChar = spaceChar;
    }
    public String makeALine(int height, int i){
        return String.format("%s%s\n", spaceChar. repeat(i),"*".repeat((2 * (height - i) - 1 )));
    }
    public static void main(String[] args) {
        ReversePyramid rPyramid = new ReversePyramid(" ");
        int height = 5;

//        for (int i = height; i > 0; i--) {
//            System.out.printf("%s%s\n", "0". repeat(height - i),"*".repeat(i * 2 -1));
//        }
        for (int i = 0; i < height; i++) {
            System.out.print(rPyramid.makeALine(height, i));
        }
    }
}
