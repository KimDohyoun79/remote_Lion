package Week11.W11_D4_221201.Programmers_기사단원의무기_R;
// https://school.programmers.co.kr/learn/courses/30/lessons/136798

public class Programmers {

    public static int solution(int number, int limit, int power) {

        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i)
                    cnt++;
                else if (i % j == 0)
                    cnt += 2;
            }

            if (cnt > limit) cnt = power;
            answer += cnt;
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(5, 3, 2)); // 10
        System.out.println(solution(10, 3, 2)); // 21
    }
}
