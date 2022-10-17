package W4_D4_221014;

import java.io.IOException;
import java.util.Arrays;

public class InsertionSort {

//    // #1 기본적인 삽입정렬
//    public int[] insertionSort(int[] arr) {
//
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (arr[j - 1] > arr[j]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = tmp;
//                }
//            }
//        }
//        return arr;
//    }

    // #2 수정 삽입정렬
    public int[] insertionSort(int[] arr) {

        int i, j, key, tmp;
        for (j = 1; j < arr.length; j++) {
            key = arr[j];
            i = j - 1;
            while(i >= 0 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] =key;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {

        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort is = new InsertionSort();
        int[] result = is.insertionSort(arr);

        System.out.println(Arrays.toString(result));
    }
}

