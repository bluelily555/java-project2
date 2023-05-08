package codeup;

import java.util.Scanner;

public class Codeup1358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n - n/2; i++) {
            for (int j = 1; j <= n - n/2 -i; j++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.printf("*");
            }
            if (i != n) System.out.println();
        }
    }
}
