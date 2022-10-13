package Code_up_51_100;

/*
    https://codeup.kr/problem.php?id=1058

 */

import java.util.Scanner;

public class Code_up_1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();

        if (a == 0 && b == 0)
            System.out.print(1);
        else
            System.out.print(0);

    }
}
