package Week5.W5_D1_221017;

public class Star03 {

    private String letter = "*";


    public Star03(){  // 기본 생성자

    }

    public Star03(String letter){  // Constructor 오버로딩
        this.letter = letter;
    }

    public void printStar(int n) {
        for (int i = 1; i <= n; i++) {  // 마름모 삼각격
            for (int space = 0; space <n-i; space++) {  // 공백
                System.out.print(" ");
            }
            for (int star = 0; star < (i*2-1); star++) { // 별
                System.out.print(letter);
            }

            System.out.println("");
        }

        for (int i = 1; i < n; i++) {   // 역삼각형
            for (int space = 0; space < i; space++) {  // 공백
                System.out.print(" ");
            }
            for (int star = 0; star < ((n-i)*2-1) ; star++) { // 별
                System.out.print(letter);
            }

            System.out.println("");
        }
    }


    public static void main(String[] args) {

        Star03 star = new Star03();
        int n = 4;
        star.printStar(n);

    }
}
