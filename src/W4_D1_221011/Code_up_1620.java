package W4_D1_221011;

import java.io.IOException;
import java.util.Scanner;
// 자리수 합
// https://codeup.kr/problem.php?id=1620

public class Code_up_1620 {

    public static int solution(int n) {
        int hap = 0;

        while (n > 0) {
            hap += n % 10;
            n /= 10;
        }

        return hap;

    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumN = n;
        while (sumN > 9) {
            sumN = solution(sumN);
        }

        System.out.println(solution(sumN));
    }
}
