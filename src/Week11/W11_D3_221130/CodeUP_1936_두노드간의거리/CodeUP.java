package Week11.W11_D3_221130.CodeUP_1936_두노드간의거리;
// https://school.programmers.co.kr/learn/courses/30/lessons/12916

import java.util.Scanner;

public class CodeUP {

    public static int findParent(int a, int b) {
        if (a > b)
            return 1 + findParent(a / 2, b);
        else if (a < b)
            return 1 + findParent(a, b / 2);
        else // a == b
            return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findParent(a, b));

//        System.out.println(findParent(3, 4)); // 3
//        System.out.println(findParent(9, 3)); // 4

    }
}
