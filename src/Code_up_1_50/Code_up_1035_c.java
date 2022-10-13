package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1035

 */

import java.util.Scanner;

public class Code_up_1035_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        sc.close();
        int b = Integer.parseInt(a, 16); // 16진수 => 10진수
        System.out.printf("%o", b); // 8진수로 출력
    }
}
