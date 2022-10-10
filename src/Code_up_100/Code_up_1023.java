package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1023

 */

import java.util.Scanner;

public class Code_up_1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("\\.");

        sc.close();
        System.out.println(a[0]+"\n"+a[1]);
    }
}
