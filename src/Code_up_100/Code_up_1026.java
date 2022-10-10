package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1026

 */

import java.util.Scanner;

public class Code_up_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        String[] b = a.split(":");
        System.out.print(Integer.parseInt(b[1]));
    }
}
