package Week10;
//https://codeup.kr/problem.php?id=1851&rid=0

import java.util.Scanner;

public class CodeUP_1851 {

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
