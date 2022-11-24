package Week10.CodeUP_1902_1부터n까지역순으로출력하기;
//https://codeup.kr/problem.php?id=1860

import java.util.Scanner;

public class CodeUP_1902 {

    public static void fibonacci(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        fibonacci(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

}
