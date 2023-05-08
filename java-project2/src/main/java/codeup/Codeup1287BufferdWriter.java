package codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1287BufferdWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < dan * i; j++) {
                bw.write("*");
            }
            bw.write("\n");
            bw.flush();
        }
    }
}
