package Week6.W6_D5_221028;

import java.util.Arrays;


/*
    문제 : [전화번호 목록](https://school.programmers.co.kr/learn/courses/30/lessons/42577)
    1. 문자열의 길이를 비교(n, n+1, n+2...)하여 n이 n+1 문자열보다 길이가 작은 경우 접두어 확인
    2. i
    3. n.length/2 < hesh.size 이면  n.length/2 return
    4. 아니면 hesh.size
 */

public class Programmers_Hash02 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);    // 1. phoneBook을 sorting

        for (int i = 0; i < phone_book.length - 1; i++)  // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;

        return true;  // 3. 접두어가 으면 true 리턴
    }

    public static void main(String[] args) {

        String[][] test = {{"119", "97674223", "1195524421"}, {"123","456","789"}, {"12","123","1235","567","88"}};

        System.out.println(solution(test[0]));
    }
}


