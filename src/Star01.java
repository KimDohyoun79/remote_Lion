public class Star01 {
    public void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Star01 star = new Star01();
        int n = 5;
        star.printStar(n);
    }
}
