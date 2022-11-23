package Week10.CodeUP_1852_재귀로1부터n까지한줄로출력하기;
//https://codeup.kr/problem.php?id=1852
import java.util.Scanner;

public class CodeUP_1852 {


    public static void recursive(int num){
        if(num==0){
            return;
        }
        recursive(num-1);
        System.out.print(num + " ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
    }
}
