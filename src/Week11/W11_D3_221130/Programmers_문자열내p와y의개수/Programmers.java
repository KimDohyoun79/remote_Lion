package Week11.W11_D3_221130.Programmers_문자열내p와y의개수;
// https://school.programmers.co.kr/learn/courses/30/lessons/12928

public class Programmers {

    public static boolean solution(String s) {
        int p = 0, y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
                p++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            }
        }
        return p == y ? true : false;
    }


    public static void main(String[] args) {
        System.out.println(solution("pPoooyY")); // true
        System.out.println(solution("Pyy")); // false
        System.out.println(solution("abc")); // true

    }
}
