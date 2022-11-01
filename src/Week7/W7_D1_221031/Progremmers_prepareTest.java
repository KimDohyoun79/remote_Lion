package Week7.W7_D1_221031;

import java.util.ArrayList;
import java.util.Arrays;

/*
    문제 : [모의고사](https://school.programmers.co.kr/learn/courses/30/lessons/42840)
    1. 수포자들 찍은 패턴답을 배열에 저장
    2. 매개변수로 받은 답을 수포자들의 답과 비교
    3. 정답을 맞춘 최대 점수 체크
    4. 최대 점수를 가진 수포자 리스트 생성하여 저장
 */

public class Progremmers_prepareTest {
    public static int[] solution(int[] answers) {
        int[] cnt = {0, 0, 0};

        // 1. 수포자들 찍은 패턴답을 배열에 저장
        int[] one = {1, 2, 3, 4, 5}; // 수포자2 답안지
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5}; // 수포자2 답안지
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 수포자3 답안지

        // 2. 매개변수로 받은 답을 수포자들의 답과 비교
        for (int i = 0; i < answers.length; i++) {  // 주어진 정답지 만틈 수포자 답안지 체크
            if (answers[i] == one[i % 5])
                cnt[0]++;
            if (answers[i] == two[i % 8])
                cnt[1]++;
            if (answers[i] == three[i % 10])
                cnt[2]++;
        }

        // 3. 정답을 맞춘 최대 점수 체크
        int max = 0;
        for (int cntNum: cnt) {
            if(cntNum >= max){
                max = cntNum;
            }
        }

        // 4. 최대 점수를 가진 수포자 리스트 생성하여 저장
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if(max == cnt[i]){
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] answers = {{1, 2, 3, 4, 5}, {1, 3, 2, 4, 2}};
        int[] result = solution(answers[1]);

        System.out.println(Arrays.toString(result));
    }
}
