package Week7.W7_D2_221101;

public class IsPrime01 {
    
    // 방법 1 : 2 ~ 자기보다 작은 수까지(num-1까지) 하나씩 나누어 소수인지 확인
    static boolean isPrime01(int num){
        long start = System.nanoTime();
        for (int i = 2; i < num; i++) {
            if(num%2 == 0)
                return false; // 나누어 지면 소수가 아니다.
        }
        long end = System.nanoTime();
        System.out.println("isPrime01 실행시간 : " + (end - start)/1000000.0);
        return true; // 위 조건을 통과 했으면 소수다.
    }



    // 방법 2 : (2 ~ num/2) 까지 하나씩 나누어 소수인지 확인 => num/2보다 큰 수로는 소수점으로 나누어 진다.
    static boolean isPrime02(int num){
        long start = System.nanoTime();
        for (int i = 2; i < num; i++) {
            if(num%2 == 0)
                return false;
        }
        long end = System.nanoTime();
        System.out.println("isPrime02 실행시간 : " + (end - start)/1000000.0);
        return true;
    }


    // 방법 3 : (2 ~ num 제곱근) 까지 하나씩 나누어 소수인지 확인 => num/2보다 큰 수로는 소수점으로 나누어 진다.
    static boolean isPrime03(int num){
        long start = System.nanoTime();
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%2 == 0)
                return false;
        }

        long end = System.nanoTime();
        System.out.println("isPrime03 실행시간 : " + (end - start)/1000000.0);
        return true;
    }



    class Solution {
        public int solution(String numbers) {
            int answer = 0;
            return answer;
        }
    }

    public static void main(String[] args) {

        int num = 11123;
        System.out.println(isPrime01(num));
        System.out.println(isPrime02(num));
        System.out.println(isPrime03(num));
    }
}
