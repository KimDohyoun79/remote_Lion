package Week10.CodeUP_1860_수삼각형출력하기;
//https://codeup.kr/problem.php?id=1860

import java.util.Scanner;

public class CodeUP_1860 {

    public static void f2(int num) {
        if (num == 0)
            return;

        f2(num - 1);
        System.out.print(num + " ");
    }

    public static void fibonacci(int num) {
        if (num == 0)
            return;

        fibonacci(num - 1);
        f2(num);
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

}
