package Code_up_51_100;

/*
    https://codeup.kr/problem.php?id=1067

 */

import java.util.Scanner;

public class Code_up_1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0)
            System.out.println("minus");
        else
            System.out.println("plus");

        if (a % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
