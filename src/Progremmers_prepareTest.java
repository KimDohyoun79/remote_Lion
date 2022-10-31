import java.util.Arrays;

public class Progremmers_prepareTest {

    public static int[] solution(int[] answers) {
        int[] result = new int[3];

        int[][] test = {
                {1, 2, 3, 4, 5, 1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};


        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            for (int j = 0; j < test[i].length; j++) {
                if (test[i][j] == answers[j % 5]) {
                    cnt++;
                }
            }
            if (cnt > 0) {
                if (cnt >= result[i])
                    result[i] = i + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        int[] result = solution(answers);

        System.out.println(Arrays.toString(result));
    }

}
