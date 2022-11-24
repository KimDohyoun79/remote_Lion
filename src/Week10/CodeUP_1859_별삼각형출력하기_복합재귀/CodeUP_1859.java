package Week10.CodeUP_1859_별삼각형출력하기_복합재귀;
//https://codeup.kr/problem.php?id=1859

import java.util.Scanner;

public class CodeUP_1859 {

    public static void f2(int num) {

        if(num == 0)
            return;
        f2(num-1);
        System.out.print("*");
    }

    public static void fibonacci(int num) {

        if(num == 0)
            return;
        fibonacci(num - 1);
        f2(num);
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

}
