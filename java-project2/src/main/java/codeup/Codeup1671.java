package codeup;

import java.util.Scanner;

public class Codeup1671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gwanghyun = sc.nextInt();
        int computer = sc.nextInt();

        if(gwanghyun == computer) System.out.println("tie");
        else if(gwanghyun == 0 && computer == 1) System.out.println("win");
        else if(gwanghyun == 1 && computer == 2) System.out.println("win");
        else if(gwanghyun == 2 && computer == 0) System.out.println("win");
        else System.out.println("lose");
    }
}
