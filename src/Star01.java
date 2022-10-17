public class Star01 {

    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int n = 5;
        printStar(n);

    }
}
