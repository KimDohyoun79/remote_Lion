package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1027

 */

import java.util.Scanner;

public class Code_up_1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        String[] b = a.split("\\.");
        System.out.print(b[2] + "-" + b[1] + "-" + b[0]);
    }
}
