package codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        int max = 0;
        int rowNum = 0;
        int colNum = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                    rowNum = i;
                    colNum = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(++rowNum + " " + ++colNum);
    }
}
