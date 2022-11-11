package Week8.W8_D5_221111;
//https://school.programmers.co.kr/learn/courses/30/lessons/17681

import java.util.Arrays;

public class BinaryNum03 {

    public static String binaryNum(int num) {

        String bi = "";
        while (num > 0) {
            bi = (num % 2) + bi;
            num /= 2;
        }

        return bi;
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        String[] arr1Binary = new String[n];
        String[] arr2Binary = new String[n];

        for (int i = 0; i < n; i++) {
            arr1Binary[i] = binaryNum(arr1[i]);
            arr2Binary[i] = binaryNum(arr2[i]);

            arr1Binary[i] = "0".repeat(n - arr1Binary[i].length()) + arr1Binary[i];
            arr2Binary[i] = "0".repeat(n - arr2Binary[i].length()) + arr2Binary[i];
        }

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");;
            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
        }

        return answer;
    }

    public static void main(String[] args) {


        System.out.println(Arrays.toString(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        // => ["#####","# # #", "### #", "# ##", "#####"]

        //System.out.println(Arrays.toString(solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10})));
        // => ["######", "### #", "## ##", " #### ", " #####", "### # "]
    }
}
