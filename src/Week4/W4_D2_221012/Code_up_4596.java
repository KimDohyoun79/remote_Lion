package Week4.W4_D2_221012;

import java.io.IOException;
import java.util.Scanner;
//https://codeup.kr/problem.php?id=4596

public class Code_up_4596 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[][] arrN = new int[9][9];

        int max = -1;
        int maxIndexI = -1;
        int maxIndexJ = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arrN[i][j] = sc.nextInt();
                if (max < arrN[i][j]) {
                    max = arrN[i][j];
                    maxIndexI = i;
                    maxIndexJ = j;
                }
            }
        }

        System.out.println(arrN[maxIndexI][maxIndexJ]);
        System.out.println(((int)maxIndexI + 1) + " " + ((int)maxIndexJ + 1));
    }
}
