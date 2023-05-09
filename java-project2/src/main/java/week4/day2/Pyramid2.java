package week4.day2;

public class Pyramid2 {
    String spacePyramid = " ";

    public Pyramid2(String space){
        spacePyramid = space;
    }

    void printPyramid(int height){
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spacePyramid.repeat(height-i-1), "*".repeat(i*2+1) );
        }
    }
    public static void main(String[] args) {
        Pyramid2 pyramid = new Pyramid2(" ");
        pyramid.printPyramid(4);

        Pyramid2 pyramidWithZero = new Pyramid2("0");
        pyramidWithZero.printPyramid(5);
    }
}
