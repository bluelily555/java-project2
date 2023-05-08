package codeup;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stair = sc.nextInt();

        for (int i = 0; i < stair; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            System.out.println("**");
        }
    }
}
