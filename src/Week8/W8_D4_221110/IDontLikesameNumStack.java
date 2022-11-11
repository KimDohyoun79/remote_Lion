package Week8.W8_D4_221110;
//https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class IDontLikesameNumStack {

    public static int[] solution(int[] arr) {

        Stack<Integer> data = new Stack<>();

        int i = 1;
        data.add(arr[0]);
        while (i < arr.length) {
            if (data.peek() != arr[i]) {
                data.add(arr[i]);
            }
            i++;
        }

        int[] answer = new int[data.size()];

        for (int j = 0; j < data.size(); j++) {
            answer[j] = data.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1}; // 1 3 0 1
        int[] arr1 = {4,4,4,3,3}; // 4 3
        int[] arr2 = {1,2,3,3,3,4}; // 1 2 3 4
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
    }
}
