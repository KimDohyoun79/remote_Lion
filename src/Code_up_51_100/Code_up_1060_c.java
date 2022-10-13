package Code_up_51_100;

/*
    https://codeup.kr/problem.php?id=1060

 */

import java.util.Scanner;

public class Code_up_1060_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        //System.out.println(Integer.toBinaryString(a));
        System.out.println(a & b);
        //System.out.println(Integer.toBinaryString(~a));
    }
}
