package week4.day2;

public class Pyramid {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", "0".repeat(height-i-1), "*".repeat(i*2+1) );
        }
    }
}
