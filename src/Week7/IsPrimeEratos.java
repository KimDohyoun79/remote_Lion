package Week7;

import java.util.LinkedList;
import java.util.List;

public class IsPrimeEratos {

    static boolean isPrimeEratos(int num) {
        long start = System.nanoTime();

        List<Integer> numArr = new LinkedList<>();
        for (int i = 2; i <= num; i++) {
            numArr.add(i);
        }

        System.out.println(numArr);
        for (int i = 0; i < numArr.size(); i++) {
            if(numArr.get(i)%2 == 0 && numArr.get(i)/2 != 1)
                numArr.remove(i);
        }

        System.out.println(numArr);

        long end = System.nanoTime();
        System.out.println("isPrimeEratos 실행시간 : " + (end - start) / 10000000.0);

        return true;
    }


    public static void main(String[] args) {

        int num = 10;
        System.out.println("isPrime01 : " + isPrimeEratos(num) + "\n");
    }
}
