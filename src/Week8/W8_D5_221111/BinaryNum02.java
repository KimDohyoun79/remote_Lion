package Week8.W8_D5_221111;
//https://school.programmers.co.kr/learn/courses/30/lessons/70129
import java.util.Arrays;

public class BinaryNum02 {

    public static int[] binaryNum02(String s) {

        int oneCount = 0;
        int zeroCount = 0;
        int programCount = 0;

        while(!s.equals("1")){
            programCount++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1')
                    oneCount++;
                else
                    zeroCount++;
            }

            s = "";
            while (oneCount > 0) {
                s = oneCount % 2 + s;
                oneCount /= 2;
            }
        }

        int[] answer = { programCount, zeroCount};
        return answer;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(binaryNum02("110010101001")));
        // [3, 8]

        System.out.println(Arrays.toString(binaryNum02("01110")));
        // [3, 3]

        System.out.println(Arrays.toString(binaryNum02("1111111")));
        // [4, 1]

    }
}
