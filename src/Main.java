import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        int result = main.solution(1234);

        if (result == 10)
            System.out.println("통과");
        else
            System.out.println(result + "실패");

    }
}
