/*
하샤드 수
https://school.programmers.co.kr/learn/courses/30/lessons/12947

 */

public class test {
    public static boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        for (int i = 1; i <= x; i++) { // 자릿수의 합 구하기
            sum += i;
        }

        if(sum%x != 0) // 나누어 떨어지는지 check하기
            answer = false;

        return answer;
    }


    public static void main(String[] args) {

        int num = 12;
        System.out.println(solution(num));
    }
}
