package W3_D3_221006.HashSet_Alpa;

import java.util.HashSet;

public class RadNumWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // 중복제거
        HashSet<Character> numbers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            int r = randomNumberGenerator.generate(26) + 97;
            numbers.add((char)r);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
