package Code_up_1_50;

/*
    https://codeup.kr/problem.php?id=1015
    입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
 */

import java.util.Scanner;

public class Code_up_1019_c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[]  day =  (sc.nextLine().split("\\."));

        System.out.printf("%04d.%02d.%02d", Integer.parseInt(day[0]), Integer.parseInt(day[1]), Integer.parseInt(day[2]));
    }
}
