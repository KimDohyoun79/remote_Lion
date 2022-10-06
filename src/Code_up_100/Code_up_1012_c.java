package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1012
    실수 1개 입력 받고 그대로 출력
 */

import java.util.Scanner;

public class Code_up_1012_c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        System.out.printf("%.6f",num);
    }
}
