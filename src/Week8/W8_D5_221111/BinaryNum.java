package Week8.W8_D5_221111;
//https://school.programmers.co.kr/learn/courses/30/lessons/12906

public class BinaryNum {

    public static int binaryNum(int num) {

        String bi = "";
        while (num > 0) {
            bi = num % 2 + bi;
            num /= 2;
        }

        return Integer.parseInt(bi);
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(binaryNum(2));
        System.out.println(binaryNum(3));
        System.out.println(binaryNum(4));


        System.out.println(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
        // => ["#####","# # #", "### #", "# ##", "#####"]

        System.out.println(solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}));
        // => ["######", "### #", "## ##", " #### ", " #####", "### # "]
    }
}
