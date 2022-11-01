package Week6.W6_D5_221028;

import java.util.HashSet;

/*
    문제 : [폰켓몬](https://school.programmers.co.kr/learn/courses/30/lessons/1845)
    1. 반복문으로 HeshSet에 n을 하나씩 add한다.
    2. n.length/2 와 hesh.size 비교
    3. n.length/2 < hesh.size 이면  n.length/2 return
    4. 아니면 hesh.size
 */

public class Programmers_Hash01 {

    public static int solution(int[] nums) {
        int answer = 0;
        HashSet set = new HashSet();

        for (int n : nums) {
            set.add(n);
        }

        answer = nums.length / 2 < set.size() ? nums.length / 2 : set.size();

        return answer;
    }

    public static void main(String[] args) {
        int[][] test = {{3, 1, 2, 3}, {3, 3, 3, 2, 2, 4}, {3, 3, 3, 2, 2, 2}};

        System.out.println(solution(test[2]));
    }
}



