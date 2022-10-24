import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQ {

    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        try {
            for (int[] arr : commands) {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for (int i = arr[0] - 1; i < arr[1]; i++) { // 1번부터 시작하니 -1
                    pq.add(arr[i]);
                }
                int result =0;
                for (int i = 0; i < arr[2]; i++) {
                     result = pq.poll(); // stack의 pop과 비슷
                }
                answer[cnt++] = result;
            }
        } catch (Exception e) {

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution2(arr, com);
        System.out.println(Arrays.toString(result));
    }
}

