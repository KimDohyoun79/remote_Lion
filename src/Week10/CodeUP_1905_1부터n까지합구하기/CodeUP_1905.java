package Week10.CodeUP_1905_1부터n까지합구하기;
//https://codeup.kr/problem.php?id=1860

import java.util.Scanner;

public class CodeUP_1905 {

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;

        return n + fibonacci(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

}
