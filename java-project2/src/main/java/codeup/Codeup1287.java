package codeup;

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= dan * i ; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
