package Week8.W8_D1_221107;/*
하샤드 수
https://school.programmers.co.kr/learn/courses/30/lessons/12947

 */

import java.util.Arrays;

public class DivisorArray {
    public static int[] solution(int[] arr, int divisor) {

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                cnt++;
        }

        if (cnt ==0){
            int[] answer = {-1};
            return answer;
        }
        else{
            int[] answer = new int[cnt];
            cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0){
                    answer[cnt++] = arr[i];
                }
            }
            Arrays.sort(answer);
            return answer;
        }


    }


    public static void main(String[] args) {

        int[][]  arr = {{5, 9, 7, 10}, {2, 36, 1, 3}, {3, 2, 6}};
        System.out.println(Arrays.toString(solution(arr[0], 5)));
        System.out.println(Arrays.toString(solution(arr[1], 1)));
        System.out.println(Arrays.toString(solution(arr[2], 10)));
    }
}
