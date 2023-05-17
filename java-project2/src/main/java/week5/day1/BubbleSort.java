package week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
//    int[] arr;
//
//    public BubbleSort(int[] arr){
//        this.arr = arr;
//    }

    Comparator<Integer> comparator;

    public BubbleSort(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    private void swap(int[] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    private void sortARound(int[] arr,int i){
        for (int j = 0; j < i; j++) {
            if(comparator.compare(arr[j], arr[j+1]) < 0){
                swap(arr, j);
            }
        }
    }
    public void sort(int[] arr){
        for (int i = arr.length - 1; i > 0; i--) {
            sortARound(arr, i);
        }
    }

//    public void reverseSort{
//
//    }
//    @Override
//    public String toString(){
//        return Arrays.toString(arr);
//    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 38, 11};

//        BubbleSort bubbleSort = new BubbleSort(arr);
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        };
        BubbleSort bubbleSort = new BubbleSort(comparator1);
        bubbleSort.sort(arr);

//        System.out.println(bubbleSort.toString());
        System.out.println(Arrays.toString(arr));
    }
}
