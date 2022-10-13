package Code_up_51_100;

/*
    https://codeup.kr/problem.php?id=1068

 */

import java.util.Scanner;

public class Code_up_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() / 10;

        if (a >= 9)
            System.out.println("A");
        else if (a >= 7)
            System.out.println("B");
        else if (a >= 4)
            System.out.println("C");
        else
            System.out.println("D");
    }
}
