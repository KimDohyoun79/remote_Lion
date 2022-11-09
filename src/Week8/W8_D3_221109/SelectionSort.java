package Week8.W8_D3_221109;
//선택정렬

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int min = -1;
        int minIndex;
        for (int i = 0; i < arr.length -1; i++) {
            minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex=j;
                }
            }
            swap(arr, minIndex, i);
        }

        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
