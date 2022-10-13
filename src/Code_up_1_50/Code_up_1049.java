package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1049

 */

import java.util.Scanner;

public class Code_up_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();

        if (a > b)
            System.out.print(1);
        else
            System.out.print(0);
    }
}
