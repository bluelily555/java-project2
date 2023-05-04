package codeup;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        int[][] arr = new int[19][19];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int stoneCnt = sc.nextInt();
        int[][] xy = new int[stoneCnt][2];
        for (int i = 0; i < stoneCnt; i++) {
            xy[i][0] = sc.nextInt() - 1;
            xy[i][1] = sc.nextInt() - 1;
        }

        for (int i = 0; i < stoneCnt; i++) {
            for (int j = 0; j < 19; j++) { //열(x좌표)뒤집기
                if(arr[xy[i][0]][j] == 0) arr[xy[i][0]][j] = 1;
                else arr[xy[i][0]][j] = 0;
            }
            for (int j = 0; j < 19; j++) { //행(y좌표)뒤집기
                if(arr[j][xy[i][1]] == 0) arr[j][xy[i][1]]  = 1;
                else arr[j][xy[i][1]]  = 0;
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
