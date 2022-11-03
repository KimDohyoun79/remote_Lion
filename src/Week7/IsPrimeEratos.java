package Week7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IsPrimeEratos {

    public static int solution(int N) {
        long start = System.nanoTime();

        if (N == 2) return 1;
        int[] nums = new int[N-1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~49까지 nums에 채우기

        for (int j = 0; j * j <= N; j++) {// N == 49
            int multipleOf = nums[j]; // j=0 nums[0] = 2
            // 초항이 2 2n인 2 4 6 8 10
            for (int i = nums[j] + j; i < nums.length; i+=multipleOf) {
                checks[i] = false;
            }
//            printNums(nums, checks);
        }
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) cnt++;
        }
        long end = System.nanoTime();
        System.out.println("isPrimeEratos 실행시간 : " + (end - start) / 1000_000_000.0);
        return cnt;
    }


    static int isPrimeEratos(int num) {
        long start = System.nanoTime();

        boolean[] numArr = new boolean[num + 1];// 0 ~ num 까지 담을 배열
        //Arrays.fill(numArr, true);
        numArr[0] = numArr[1] = true;   // 0과 1은 소수가 아니므로 true
        for (int i = 2; i <= Math.sqrt(num); i++) {
            for (int j = i; j <= num; j += i) {
                if (j % i == 0 && j / i != 1)
                    numArr[j] = true;   // 소수가 아니면 true
            }
        }

        int cnt = 0;
        for (int i = 0; i <= num; i++) {
            if (!numArr[i])
                cnt++;
        }

        long end = System.nanoTime();
        System.out.println("isPrimeEratos 실행시간 : " + (end - start) / 1000_000_000.0);

        return cnt;
    }


    public static void main(String[] args) {

        int num = 24535333;
        System.out.println("isPrimeEratos : " + isPrimeEratos(num) + "\n");
        System.out.println("solution : " + solution(num) + "\n");
    }
}
