package Week7.W7_D2_221101;

public class IsPrime02_Callback {

    static boolean someOperation(int a, int b){
        return a< b;
    }

    static boolean isPrime01(int num) {

        for (int i = 2; someOperation(i, num); i++) {
            if (num % 2 == 0)
                return false; // 나누어 지면 소수가 아니다.
        }

        return true; // 위 조건을 통과 했으면 소수다.
    }


    public static void main(String[] args) {

        int num = 12;
        System.out.println("isPrime01 : " + isPrime01(num) + "\n");
        //System.out.println("isPrime02 : " + isPrime02(num) + "\n");
        //System.out.println("isPrime03 : " + isPrime03(num) + "\n");
    }
}
