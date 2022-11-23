package Week9.W9_D5_221118;
//https://school.programmers.co.kr/learn/courses/30/lessons/12926
//https://ivory-room.tistory.com/23

import java.util.Arrays;

public class MatrixAddition {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        int[][] arr = {{1,2}, {2, 3}};
        int[][] arr1 = {{3,4}, {5, 6}};
        int[][] arr2 = {{1}, {2}};
        int[][] arr3 = {{3}, {4}};

        System.out.println(Arrays.deepToString(solution(arr, arr1)));
        System.out.println(Arrays.deepToString(solution(arr2, arr3)));
    }
}