package codeup;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stoneCnt = sc.nextInt();
        int[][] arr = new int[19][19];

        for (int i = 0; i < stoneCnt; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            arr[row-1][col-1] = 1;
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
