package W5_D1_221017;

public class Star02 {

    private String letter = "*";

    public Star02(){  // 기본 생성자

    }

    public Star02(String letter){  // Constructor 오버로딩
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
