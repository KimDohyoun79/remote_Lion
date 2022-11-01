package Week7.W7_D2_221101;

public class IsPrime01 {
    static boolean isPrime(int num){

        for (int i = 2; i < num; i++) {
            if(num%2 == 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {


        System.out.println(isPrime(11));

    }
}
