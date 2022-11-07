/*
하샤드 수
https://school.programmers.co.kr/learn/courses/30/lessons/12947

 */

public class HarshadNumber {
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


    public static void main(String[] args) {

        System.out.println("10 : " + solution(10));
        System.out.println("12 : " + solution(12));
        System.out.println("11 : " + solution(11));
        System.out.println("13 : " + solution(13));
    }
}
