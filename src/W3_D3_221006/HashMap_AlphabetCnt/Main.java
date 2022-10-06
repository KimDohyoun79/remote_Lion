package W3_D3_221006.HashMap_AlphabetCnt;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();

        // 소문자는 대문자로
        String s1 = "a1a1baavfa2bc/cdf2hdf342hrde234d".toUpperCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();

        // 해쉬맵 초기화
        for (char c = 'A'; c < 'Z'; c++) {
            alphabetMap.put(c, 0);
        }

        // 해쉬맵으로 알바벳 카운드
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean isAlphavet = alphabetCnt.isAlphabet(c);
            if (isAlphavet) {
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }

        System.out.println(alphabetMap);

    }
}
