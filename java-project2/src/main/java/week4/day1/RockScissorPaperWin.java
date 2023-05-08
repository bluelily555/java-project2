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
            int me = sc.nextInt();
            int computer = rand.nextInt(3);

            System.out.println("컴퓨터: " + computer);
            if(me - computer == 0) System.out.println("tie");
            else if (me - computer == -1 || me - computer == 2){
                System.out.println("win");
                win = true;
            } else System.out.println("lose");
        } while(!win);
    }

}
