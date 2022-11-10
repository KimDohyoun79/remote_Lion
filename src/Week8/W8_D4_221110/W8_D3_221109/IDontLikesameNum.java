package Week8.W8_D4_221110.W8_D3_221109;
//선택정렬

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IDontLikesameNum {

    public static int[] solution(int[] arr) {


        List<Integer> data = new LinkedList<Integer>();
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                data.add(arr[i]);
                while (i < arr.length - 1) {
                    if (arr[i] == arr[i + 1]) {
                        i++;
                    } else
                        break;
                }
            } else {
                data.add(arr[i]);
            }
            i++;
        }

        int[] answer = new int[data.size()];

        for (int j = 0; j < data.size(); j++) {
            answer[j] = data.get(j);
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println(Arrays.toString(solution(arr)));
    }
}
