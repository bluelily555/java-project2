package codeup;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hight = sc.nextInt();
        int width = sc.nextInt();
        int[][] arr = new int[hight][width];

        int number = sc.nextInt();
        int[][] stickArr = new int[number][4];

        for (int i = 0; i < number; i++) { //막대의 info(길이, 방향, x, y)
            stickArr[i][0] = sc.nextInt();
            stickArr[i][1] = sc.nextInt();
            stickArr[i][2] = sc.nextInt() - 1;
            stickArr[i][3] = sc.nextInt() - 1;
        }

        int c = 1;
        for (int[] info : stickArr) {
            if (info[1] == 0){
                for (int i = 0; i < info[0]; i++) {
                    arr[info[2]][info[3] + i] = 1;
                }
            } else {
                for (int i = 0; i < info[0]; i++) {
                    arr[info[2] + i][info[3]] = 1;
                }
            }
        }

        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
