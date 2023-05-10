package week4.day3;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Diamond {
    //[도전] .repeat()안쓰고 마름모 출력
    String getRepeatSimbol(String simbol, int repeat){ //ㅇㅅㅇ
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += simbol;
        }

        return result;
    }

    //[도전] 그림을 file로 출력
    void outFile(int height){
        try{
            OutputStream os = new FileOutputStream("./Diamond.txt");
            String str = makeADiamond(height);
            byte[] byteArr=str.getBytes();
            os.write(byteArr);
        } catch (Exception e){
            e.getStackTrace();
        }
    }

    String makeADiamond(int height){
        String result = "";

        for (int i = 0; i < height; i++) {
            result += makeALine(height, i);
        }

        return result;
    }

    //makeALine으로 분리
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

    //printShape 메소드 만들기
    void printShape(int height){
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) {
        int height = 7;
        int pivot = height / 2;

        //다이아몬드 출력
        for (int i = 0; i < height; i++) {
            if(i < height / 2){
                System.out.printf("%s%s\n", " ".repeat(pivot - i), "*".repeat(2 * i + 1));
            } else {
                System.out.printf("%s%s\n", " ".repeat(i - pivot), "*".repeat(2 * (height - i) - 1));
            }
        }

        Diamond diamond = new Diamond();
        diamond.outFile(height);
        System.out.println(diamond.makeADiamond(height));
        diamond.printShape(height);


    }
}
