package Week8.W8_D3_221109;
//선택정렬

import java.util.Arrays;


public class SelectionSortLamdaCallback {

    // interface를 선언하고
    // Template Callback패턴
    interface StatementStrategy {
        boolean compare(int a, int b);
    }

    private static void selectSort(int[] arr, StatementStrategy stmt) {
        int min = -1;
        int minIdx;
        for (int i = 0; i < arr.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (stmt.compare(arr[minIdx], arr[j])) {
                    minIdx = j;
                }
            }
            swap(arr, minIdx, i);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        selectSort(arr, (a, b) -> a > b); // 오름차순
        selectSort(arr, (a, b) -> a < b); // 내림차순
    }
}
