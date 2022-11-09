package Week8.W8_D3_221109;
//선택정렬

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int min = -1;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println(minIndex);
    }
}
