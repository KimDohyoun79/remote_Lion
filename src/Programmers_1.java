import java.io.IOException;
//https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class Programmers_1 {

    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {
        Programmers_1 main = new Programmers_1();
        int result = main.solution(1234);

        if (result == 10)
            System.out.println("통과");
        else
            System.out.println(result + "실패");

    }
}
