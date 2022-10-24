import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};

        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution1 solution1 = new Solution1();
        int[] result = solution1.solution(arr, com);
        System.out.println(Arrays.toString(result));
    }

}

class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        try {
            for (int[] arr : commands) {
                int[] tmp = Arrays.copyOfRange(array, arr[0]-1, arr[1]);
                Arrays.sort(tmp);
                answer[cnt++] = tmp[arr[2] - 1];
            }
        } catch (Exception e) {

        }
        return answer;
    }
}