package Week8.W8_D2_221108;

import java.util.HashMap;
import java.util.Scanner;

//https://codeup.kr/problem.php?id=3001
public class SimpleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < N; i++) {
            arr.put(sc.nextInt(), i+1);
        }
        int k = sc.nextInt();

        if(arr.containsKey(k))
            System.out.println(arr.get(k));
        else
            System.out.println(-1);
    }
}
