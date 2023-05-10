package week4.day3;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Diamond {
    String getRepeatSimbol(String simbol, int repeat){ //ㅇㅅㅇ
        String result = "";

        for (int i = 0; i < repeat; i++) {
            result += simbol;
        }

        return result;
    }

    String makeALine(int height, int n){
        String result = "";

        int pivot = height / 2;

        if(n < height / 2){
            result += getRepeatSimbol("0", pivot - n);
            result += getRepeatSimbol("*", 2 * n + 1) + "\n";
        } else {
            result += getRepeatSimbol("0", n - pivot);
            result += getRepeatSimbol("*", 2 * (height - n) - 1) + "\n";
        }
        return result;
    }
    String makeADiamond(int height){
        String result = "";
        for (int i = 0; i < height; i++) {
            result += makeALine(height, i);
        }
        return result;
    }
    void outFile(int height){
        try{
            OutputStream os = new FileOutputStream("C:/Users/shia7/like-lion-java/java-project2/src/main/java/week4/day3/Diamond.txt");
            String str = makeADiamond(height);
            byte[] byteArr=str.getBytes();
            os.write(byteArr);
        } catch (Exception e){
            e.getStackTrace();
        }
    }


    void printShape(int height){
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) {
        int height = 7;
        int pivot = height / 2;

        for (int i = 0; i < height; i++) {
            if(i < height / 2){
                System.out.printf("%s%s\n", " ".repeat(pivot - i), "*".repeat(2 * i + 1));
            } else {
                System.out.printf("%s%s\n", " ".repeat(i - pivot), "*".repeat(2 * (height - i) - 1));
            }
        }

        Diamond diamond = new Diamond();
        System.out.println(diamond.makeADiamond(height));
        diamond.printShape(height);
        diamond.outFile(height);


    }
}
