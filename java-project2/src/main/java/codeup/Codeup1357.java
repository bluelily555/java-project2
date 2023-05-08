package codeup;

import java.util.Scanner;

public class Codeup1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n * 2; i++) {
            if(i <= n){
                for (int j = 0; j < i; j++) {
                    System.out.printf("*");
                }
            } else {
                for (int j = i-n; j < n; j++) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
