package Week4.W4_D3_221013;

import java.util.Arrays;

public class BubbleSort01 {

    public static void main(String[] args) {
        int [] arr = new int[]{9, 2, 3, 8, 7, 5, 1, 4, 6};

        BSort bsort = new BSort();
        arr = bsort.sort_test(arr);
        System.out.printf(Arrays.toString(arr));
    }
}

class BSort{

    int[] sort_test(int[] arr){

        int tmp;
        for(int i =0; i < arr.length-1;i++){
            for (int j = i+1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =tmp;
                }
            }
        }
        return arr;
    }

}