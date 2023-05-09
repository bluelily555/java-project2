package codeup;

import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i ; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < height; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
