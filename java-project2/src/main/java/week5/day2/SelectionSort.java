package week5.day2;

import java.util.Arrays;

public class SelectionSort {
    private void swap (int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
    public int[] sort (int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
//        int val = arr[0];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
//                    val = arr[j];
                    idx = j;
                }
            }
            swap(arr, i, idx);

            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        SelectionSort ss = new SelectionSort();
        arr = ss.sort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
