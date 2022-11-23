package Week10.CodeUP_1854_재귀로각자리수의합리턴하기;
//https://codeup.kr/problem.php?id=1854

import java.util.Scanner;

public class CodeUP_1854 {

    public static long recursive(long num) {
        if (num == 0) {
            return 0;
        }
        return (long) (num % 10 + recursive(num / 10));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(recursive(n));
    }
}
