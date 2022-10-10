package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1024

 */

import java.util.Scanner;

public class Code_up_1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();

        for(int i=0; i< a.length(); i++){
            System.out.println("\'" + a.charAt(i) + "\'");
        }
    }
}
