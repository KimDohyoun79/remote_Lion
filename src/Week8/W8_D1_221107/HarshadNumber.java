package Week8.W8_D1_221107;/*
하샤드 수
https://school.programmers.co.kr/learn/courses/30/lessons/12947

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class HarshadNumber {


    // 배열로 처리하는 방법
    public static boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int tmpX = x;
        while (tmpX > 0) { // 자릿수의 합 구하기
            sum += tmpX % 10;
            tmpX /= 10;
        }

        try {
            if (x % sum != 0) // 나누어 떨어지는지 check하기
                answer = false;
        } catch (ArithmeticException e) {
        }

        return answer;
    }


    //1번 방법 List()
    public int[] solution1(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        // list를 Array로 바꾸고
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // sort 한 것을 리턴
        Arrays.sort(answer);
        return answer;
    }


    // 2번 방법 PriorityQueue()
    public int[] solution2(int[] arr, int divisor) {

        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        // list를 Array로 바꾸고
        int[] answer = new int[list.size()];
        int idx = 0;
        while(!list.isEmpty()){
            answer[idx++] = list.poll();
        }
        return answer;
    }


    public static void main(String[] args) {

        System.out.println("10 : " + solution(10));
        System.out.println("12 : " + solution(12));
        System.out.println("11 : " + solution(11));
        System.out.println("13 : " + solution(13));
    }
}
