
import java.io.IOException;
import java.util.Scanner;
// 자리수 계산
// https://codeup.kr/problem.php?id=1278

public class Code_up_1278 {

    public static int solution(int n) {
        int cnt = 0;

        while(n > 0){
            n /= 10;
            cnt++;
        }

        return cnt;

    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
