package Week10.CodeUP_1851_단순재귀로별찍기;
//https://codeup.kr/problem.php?id=1851
import java.util.Scanner;

public class CodeUP_1851 {


    public static void re(int num){
        if(num==0){
            return;
        }
        System.out.print("*");
        re(--num);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        re(n);
    }
}
