package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1015
    실수 1개 입력 받고 소수점 셋 째 자리에서 반올림
 */

import java.util.Scanner;

public class Code_up_1015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        System.out.printf("%.2f", num);
    }
}
