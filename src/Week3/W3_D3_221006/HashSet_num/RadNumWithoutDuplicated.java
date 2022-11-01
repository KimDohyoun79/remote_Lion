package Week3.W3_D3_221006.HashSet_num;

import java.util.HashSet;

public class RadNumWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        // 중복제거
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            numbers.add(r);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
