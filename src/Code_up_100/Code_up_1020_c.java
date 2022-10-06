package Code_up_100;

/*
    https://codeup.kr/problem.php?id=1015
    입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
 */

import java.util.Scanner;

public class Code_up_1020_c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        num = num.replace("-", "");
        System.out.printf(num);
    }
}
