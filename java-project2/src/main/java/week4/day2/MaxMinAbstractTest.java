package week4.day2;

public class MaxMinAbstractTest {
    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 9};

        MaxMinAbstract mma1 = new MaxExtends();
        mma1.printMaxOrMin(arr);

        MaxMinAbstract mma2 = new MinExtends();
        mma2.printMaxOrMin(arr);
    }
}
