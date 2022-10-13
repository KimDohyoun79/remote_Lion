package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1043

 */

import java.util.Scanner;

public class Code_up_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        sc.close();
        System.out.print(a % b);
    }
}
