package Week9.W9_D1_221114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class IsPrimeEratos01 {
    static int isPrimeEratos01(int num) {

        int[] numArr = new int[num - 1];

        for (int i = 2; i <= num; i++) {
            numArr[i - 2] = i;
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 2; i*i <= num; i++) {
            for (int j = i+i; j <= num; j+=i) {
                numArr[j-2] = 0;
            }
        }
        System.out.println(Arrays.toString(numArr));

        int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if(numArr[i] != 0)
                count++;
        }

        return count;

    }


    public static void main(String[] args) {

        int num = 50;
        System.out.println("isPrimeEratos : " + isPrimeEratos01(num) + "\n");
    }
}
