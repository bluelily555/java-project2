package week4.day2;

public class MaxExtends extends MaxMinAbstract{
    @Override
    public boolean checkMaxMin(int m, int i) {
        return m < i;
    }

//    @Override
//    public int maxMin(int[] arr) {
//        int max = arr[0];
//
//        for (int i : arr) {
//            if(max < i) max = i;
//        }
//        return max;
//    }
}
