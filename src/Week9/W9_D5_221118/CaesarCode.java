package Week9.W9_D5_221118;
//https://school.programmers.co.kr/learn/courses/30/lessons/12926
//https://ivory-room.tistory.com/23

public class CaesarCode {

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                sb.append((char) ((s.charAt(i) - 'a' + n)% 26 + 'a'));

            } else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                sb.append((char) ((s.charAt(i) - 'A' + n)% 26 + 'A'));
            }
            else
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", 1));
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
        System.out.println(solution("XYZ", 4));
        System.out.println(solution("abcdefghijklmnopqrstuvwxyz", 25));
    }
}