package codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(16);

        for (int i = 0x1; i <= 0xF; i++){
            System.out.printf("%X*%X=%X\n", input, i, input * i);
        }
    }
}
