package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1014
    문자 2개 입력 받고 그대로 출력
 */

import java.util.Scanner;

public class Code_up_1014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] word = new String[2];

        word[0] = sc.next();
        word[1] = sc.next();

        System.out.printf(word[1] + " " + word[0]);
    }
}
