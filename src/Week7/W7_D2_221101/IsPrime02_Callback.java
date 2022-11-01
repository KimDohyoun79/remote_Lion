package Week7.W7_D2_221101;

interface StatemaentStrategy {
    boolean compare(int a, int b);
}


public class IsPrime02_Callback {

    static boolean someOperation(int a, int b) {
        return a < b;
    }

    static boolean isPrime01(int num, StatemaentStrategy stmt) {

        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % 2 == 0)
                return false; // 나누어 지면 소수가 아니다.
        }

        return true; // 위 조건을 통과 했으면 소수다.
    }


    public static void main(String[] args) {
        IsPrime02_Callback cb = new IsPrime02_Callback();
        int num = 12;

        System.out.println(cb.isPrime01(num, ((a, b) -> a < b)));
        System.out.println(cb.isPrime01(num, ((a, b) -> a < b / 2)));
        System.out.println(cb.isPrime01(num, ((a, b) -> a * a < b)));
    }
}
