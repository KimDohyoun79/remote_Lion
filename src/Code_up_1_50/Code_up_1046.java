package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1046

 */

import java.util.Scanner;

public class Code_up_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        sc.close();
        System.out.println(a + b + c);
        System.out.printf("%.1f", (a + b + c) / (double) 3);
    }
}
