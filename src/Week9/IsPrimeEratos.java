package Week9;

import java.util.Arrays;

public class IsPrimeEratos {
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

        return 0;

    }


    public static void main(String[] args) {

        int num = 50;
        System.out.println("isPrimeEratos : " + isPrimeEratos01(num) + "\n");
    }
}
