package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1013
    정수 2개 입력 받고 그대로 출력
 */

import java.util.Scanner;

public class Code_up_1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];

        num[0] = sc.nextInt();
        num[1] = sc.nextInt();

        System.out.printf(num[0] + " " + num[1]);
    }
}
