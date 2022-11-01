package Week3.W3_D3_221006.HashSet_Alpha;

import java.util.HashSet;

public class RadNumWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // 중복제거
        HashSet<Character> alpha = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            char r = randomNumberGenerator.generate(26); //A~Z 26개의 알파벳
            alpha.add(r);
        }

        System.out.println(alpha);
        System.out.println(alpha.size());
    }
}
