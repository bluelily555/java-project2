package codeup;

import java.util.Scanner;

public class Codeup1256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

//        for (int i = 0; i < cnt; i++) {
//            System.out.printf("*");
//        }

        System.out.println("*".repeat(cnt));  //Java 11부터 가능
    }
}
