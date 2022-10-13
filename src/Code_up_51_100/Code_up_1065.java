package Code_up_51_100;

/*
    https://codeup.kr/problem.php?id=1065

 */

import java.util.Scanner;

public class Code_up_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a % 2 == 0)
            System.out.println(a);
        if (b % 2 == 0)
            System.out.println(b);
        if (c % 2 == 0)
            System.out.println(c);
    }
}
