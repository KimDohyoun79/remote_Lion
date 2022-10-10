package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1034

 */

import java.util.Scanner;

public class Code_up_1034_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        sc.close();
        int b = Integer.parseInt(a, 8); // 8진수 => 10진수
        System.out.print(b);
    }
}
