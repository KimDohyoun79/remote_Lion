package Week11.W11_D3_221130.Programmers_약수의합;
// https://school.programmers.co.kr/learn/courses/30/lessons/12928

public class Programmers {

    public static int solution1(int n) {

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(Math.floorMod(n, i) == 0)
                answer+=i;
        }

        return answer;
    }

    public static int solution(int n) {

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0)
                answer+=i;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(5));

        System.out.println(solution1(12));
        System.out.println(solution1(5));
    }
}
