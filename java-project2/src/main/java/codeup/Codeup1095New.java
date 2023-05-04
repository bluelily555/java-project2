package codeup;

import java.util.Scanner;

public class Codeup1095New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int callCnt = sc.nextInt();
        int min = callCnt;

        for (int i = 0; i < callCnt; i++) {
            int temp = sc.nextInt();
            if(min > temp) min = temp;
        }
        System.out.println(min);
    }
}