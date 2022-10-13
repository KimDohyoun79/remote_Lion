package Code_up_51_100;

/*
    https://codeup.kr/problem.php?id=1064

 */

import java.util.Scanner;

public class Code_up_1064_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println((a > b ? b : a) > c ? c : (a > b ? b : a));
    }
}
