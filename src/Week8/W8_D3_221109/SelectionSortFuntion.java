package Week8.W8_D3_221109;
//선택정렬

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;


public class SelectionSortFuntion {


    private static void selectSort(int[] arr, BiFunction<Integer, Integer, Boolean> stmt) {
        int min = -1;
        int minIdx;
        for (int i = 0; i < arr.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) {
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

        // BiFunction<T, T, R> 인터페이스를 사용한 Template Callback패턴
        selectSort(arr, (a, b) -> a > b); // 오름차순
        selectSort(arr, (a, b) -> a < b); // 내림차순

        //Function<T, R> 인터페이스 쓰는 법
        //여기에서 T는 입력받는 타입, R은 리턴 타입
        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        System.out.println(fn.apply(new Integer[]{10, 20}));

        //앞에 두개 타입을 Integer a, Integer b로 받아서 True or False로 리턴
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
        System.out.println(biFunction.apply(10,20));
    }
}
