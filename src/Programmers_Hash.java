//https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java

import java.util.HashMap;

public class Programmers_Hash {
    public static void main(String[] args) {
        HashSolution hash = new HashSolution();
        int index = 0;
        String[][] participant = {{"leo", "kiki", "eden"}, {"marina", "josipa", "nikola", "vinko", "filipa"}, {"mislav", "stanko", "mislav", "ana"}};
        String[][] completion = {{"eden", "kiki"}, {"josipa", "filipa", "marina", "nikola"}, {"stanko", "ana", "mislav"}};

        System.out.println(hash.solution(participant[index], completion[index]));

    }
}
/*
    1. HashMep으로 key : participant, value : 1 로 세팅
    2. 만약 participant에서 중복 이름이 있을 경우 기본 value 값에서 +1을 한다.
    3. completion의 이름을 하나씩 검색하여 value - 1을 한다.
    4. value 값이 0이 아닌경우 반환 
 */

class HashSolution {
    public String solution(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            hashMap.put(s, hashMap.get(s) - 1);
        }

        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}
