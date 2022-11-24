package Week10.CodeUP_1855_재귀로n번째피보나치수리턴하기;
//https://codeup.kr/problem.php?id=1855

import java.util.Scanner;

public class CodeUP_1855 {

    public static int fibonacci(int num) {
        if (num <= 2) {
            return 1;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
