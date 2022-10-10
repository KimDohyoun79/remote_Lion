package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1025

 */

import java.util.Scanner;

public class Code_up_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();

        int n = 10000;
        for(int i=0; i< a.length(); i++){
            System.out.println("[" + ((a.charAt(i) - '0') * n) + "]");
            n /=10;
        }
    }
}
