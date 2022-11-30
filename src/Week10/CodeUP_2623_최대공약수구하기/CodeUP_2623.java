package Week10.CodeUP_2623_최대공약수구하기;
//https://codeup.kr/problem.php?id=2623

import java.util.Scanner;

public class CodeUP_2623 {
    public static int gcd(int a, int b) {
        if (a == b)
            return a;
        else if (a > b)
            return gcd(a - b, b);
        else
            return gcd(a, b - a);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}
