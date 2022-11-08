package Week8.W8_D2_221108;
//https://codeup.kr/problem.php?id=2083

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int star = 0;
        int end = arr.length - 1;
        int mid;
        while (star <= end) {
            mid = (star + end) / 2;

            if (arr[mid] == num) {
                System.out.println(mid + 1);
                return;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                star = mid + 1;
            }
        }
        System.out.println(-1);
    }
}
