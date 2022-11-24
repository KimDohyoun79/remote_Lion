package Week10.CodeUP_1904_두수사이의홀수출력;
//https://codeup.kr/problem.php?id=1860

import java.util.Scanner;

public class CodeUP_1904 {

    public static void f2(int num) {
        if (num == 0)
            return;

        f2(num - 1);
        System.out.print(num + " ");
    }

    public static void fibonacci(int a, int b) {
        if (a > b)
            return;

        if (a % 2 == 1)
            System.out.print(a + " ");

        fibonacci(a+1, b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        fibonacci(a, b);
    }

}
