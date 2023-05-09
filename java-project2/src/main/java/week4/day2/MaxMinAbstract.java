package week4.day2;

public abstract class MaxMinAbstract {
    public abstract boolean checkMaxMin(int m, int i);

    public void printMaxOrMin(int[] arr){
        int result = arr[0];

        for (int i : arr) {
            if(checkMaxMin(result, i)) result = i;
        }

        System.out.println(result);
    }
}
