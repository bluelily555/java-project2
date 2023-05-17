package week5.day2;

import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    private void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
    }
    int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) swap(arr, j);
                else break;
            }
        }
        return arr;
    }
    int[] sort(int[] arr, boolean isAscending){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(isAscending ? arr[j] < arr[j-1] : arr[j] > arr[j-1]) swap(arr, j);
                else break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28 , 11};

        InsertionSort insertionSort = new InsertionSort();
        arr = insertionSort.sort(arr,true);

        System.out.println(Arrays.toString(arr));



    }
}
