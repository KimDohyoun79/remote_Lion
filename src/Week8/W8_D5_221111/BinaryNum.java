package Week8.W8_D5_221111;
//https://school.programmers.co.kr/learn/courses/30/lessons/12906

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryNum {

    public static int solution(int num) {


        String bi = "";
        while (num > 0) {
            bi = num % 2 + bi;
            num /= 2;
        }

        return Integer.parseInt(bi);
    }

    public static void main(String[] args) {

        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
}
