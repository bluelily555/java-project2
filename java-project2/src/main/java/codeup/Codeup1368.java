package codeup;

import java.util.Scanner;

public class Codeup1368 {
    String makeALineFor(int height, int width, int i, String direction){
        String result = "";
        int directionJ = 0;

        if(direction.equals("L")){
            directionJ = i - 1;
        }
        else {
            directionJ = height - i;
        }

        for (int j = 0; j < directionJ ; j++) {
            result += " ";
        }
        for (int j = 0; j < width; j++) {
            result += "*";
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        String direction = sc.next();

        Codeup1368 codeup = new Codeup1368();


        for (int i = 1; i <= height; i++) {
            System.out.println(codeup.makeALineFor(height, width, i, direction));
        }
    }
}
