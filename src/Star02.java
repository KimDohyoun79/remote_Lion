public class Star02 {

    private String letter = "*";

    public Star02(){

    }

    public Star02(String letter){
        this.letter = letter;
    }

    public void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space <n-i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (i*2-1); star++) {
                System.out.print(letter);
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {

        Star02 star = new Star02();
        int n = 5;
        star.printStar(n);

    }
}
