package week4.day2;

public class MinExtends extends MaxMinAbstract{
    @Override
    public boolean checkMaxMin(int m, int i) {
        return m > i;
    }

//    @Override
//    public int maxMin(int[] arr) {
//        int min = arr[0];
//        for (int i : arr) {
//            if(min > i) min = i;
//        }
//        return min;
//    }
}
