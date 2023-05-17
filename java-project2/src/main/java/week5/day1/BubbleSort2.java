package week5.day1;

import java.util.Arrays;

public class BubbleSort2 {

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }

    public void sort(int[] arr, boolean isAsc){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(isAsc){
                    if(arr[i] > arr[j]){
                        swap(arr, i, j);
                    }
                }
                else {
                    if(arr[i] < arr[j]){
                        swap(arr, i, j);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        BubbleSort2 bubbleSort2 = new BubbleSort2();
//        bubbleSort2.sort(arr);
//        System.out.println(Arrays.toString(arr));

        bubbleSort2.sort(arr, false);
        System.out.println(Arrays.toString(arr));

    }
}
