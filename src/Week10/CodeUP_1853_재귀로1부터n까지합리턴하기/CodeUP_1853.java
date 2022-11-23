package Week10.CodeUP_1853_재귀로1부터n까지합리턴하기;
//https://codeup.kr/problem.php?id=1852
import java.util.Scanner;

public class CodeUP_1853 {


    public static int recursive(int num){
        if(num==1){
            return 1;
        }

        return num + recursive(num-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursive(n));
    }
}
