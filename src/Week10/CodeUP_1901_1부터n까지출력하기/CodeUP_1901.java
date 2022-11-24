package Week10.CodeUP_1901_1부터n까지출력하기;
//https://codeup.kr/problem.php?id=1860

import java.util.Scanner;

public class CodeUP_1901 {

    public static void fibonacci(int n) {
        if (n == 0)
            return;

        fibonacci(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

}
