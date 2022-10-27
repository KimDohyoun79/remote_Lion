//https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java

import java.util.HashMap;

public class Programmers_Hash {
    public static void main(String[] args) {
        HashSolution hash = new HashSolution();
        String[][] participant = {{"leo", "kiki", "eden"}, {"marina", "josipa", "nikola", "vinko", "filipa"}, {"mislav", "stanko", "mislav", "ana"}};
        String[][] completion = {{"eden", "kiki"}, {"josipa", "filipa", "marina", "nikola"}, {"stanko", "ana", "mislav"}};

        hash.solution(participant[2], completion[2]);

    }


}

class HashSolution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
            System.out.println(hashMap);
        }

        for (String s : completion) {
            int a = hashMap.get(s);
            System.out.println(a);
        }

        return answer;
    }
}
