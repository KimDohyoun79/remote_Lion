package Week10.CodeUP_1912_팩토리얼;
//https://codeup.kr/problem.php?id=1912

import java.util.Scanner;

public class CodeUP_1912 {

    public static int fac(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fac(num - 1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
}
