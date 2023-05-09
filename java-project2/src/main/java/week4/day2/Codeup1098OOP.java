package week4.day2;

import java.util.Scanner;

public class Codeup1098OOP {
    private int[][] arr;
    private boolean printSeparator;

    //생성자 오버로딩
    public Codeup1098OOP(){
        arr = new int[5][5];
    }
    public Codeup1098OOP(boolean printSeparator){
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }
    public Codeup1098OOP(int rowCnt){
        arr = new int[rowCnt][rowCnt];
    }
    public Codeup1098OOP(int rowCnt, int colCnt){
        arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int direction, int x, int y){
        for (int i = 0; i < l; i++) {
            if(direction == 0){ //가로
                arr[x - 1][y + i - 1] = 1;
            } else { //세로
                arr[x + i - 1][y - 1] = 1;

            }
        }
    }
    public void printArray(int[][] arr){
        for (int[] rowArr : arr) {
            for (int i: rowArr) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowCnt = sc.nextInt();
        int colCnt = sc.nextInt();
        int beamCnt = sc.nextInt();

        Codeup1098OOP c1098 = new Codeup1098OOP(rowCnt, colCnt);

        for (int i = 0; i < beamCnt; i++) {
            c1098.setBeam(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        c1098.printArray(c1098.arr);
    }
}
