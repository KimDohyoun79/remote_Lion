package W4_D2_221012;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
//https://codeup.kr/problem.php?id=2081

public class Code_up_2081 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] arrN = new int[9];

        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < 9; i++) {
            arrN[i] = sc.nextInt();
            if (max < arrN[i]) {
                max = arrN[i];
                maxIndex = i;
            }
        }

        System.out.println(arrN[maxIndex]);
        System.out.println(maxIndex + 1);
    }
}
