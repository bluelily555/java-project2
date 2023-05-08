package week4.day1;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaperWin {
    public static void main(String[] args) {
        RockScissorPaperWin rspw = new RockScissorPaperWin();

        rspw.start();

    }

    void start(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean win = false;
        do{
            String me = sc.next();
            int computer = rand.nextInt(3);

            int meInt;
            if(me.equals("바위")) meInt = 0;
            else if(me.equals("가위")) meInt = 1;
            else meInt = 2;

            if(computer == 0) System.out.println("컴퓨터: 바위");
            else if(computer == 1) System.out.println("컴퓨터: 가위");
            else System.out.println("컴퓨터: 보");

            if(meInt - computer == 0) System.out.println("tie");
            else if (meInt - computer == -1 || meInt - computer == 2){
                System.out.println("win");
                win = true;
            } else System.out.println("lose");
        } while(!win);
    }
}
