package week4.day2;

public class Pyramid2MethodOut {
//    주석 처리된 것은 멤버변수, 파라미터를 갖는 생성자를 사용하지 않는 경우의 소스
//    void printPyramid(String spaceChar, int height){
//        for (int i = 0; i < height; i++) {
//            System.out.print(makeALine(spaceChar, height, i));
//        }
//    }
//    String makeALine(String spaceChar, int height, int i){
//        return String.format("%s%s\n", spaceChar.repeat(height-i-1), "*".repeat(i*2+1));
//    }
//    public static void main(String[] args) {
//        Pyramid2MethodOut pyramid = new Pyramid2MethodOut();
//        pyramid.printPyramid(" ", 4);
//        pyramid.printPyramid("%", 4);
//        pyramid.printPyramid("0", 4);
//    }
    String spaceChar = " ";

    public Pyramid2MethodOut(String space){
        spaceChar = space;
    }

    void printPyramid(int height){
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    String makeALine(int height, int i){
        return String.format("%s%s\n", spaceChar.repeat(height-i-1), "*".repeat(i*2+1));
    }

    public static void main(String[] args) {
        Pyramid2MethodOut pyramid = new Pyramid2MethodOut(" ");
        pyramid.printPyramid(4);

        Pyramid2MethodOut pyramidWithZero = new Pyramid2MethodOut("0");
        pyramidWithZero.printPyramid(5);
    }
}
