package Week5.W5_D1_221017;

public class Star_Constructor {

    private String letter = "*";

    public Star_Constructor(){

    }

    public Star_Constructor(String letter){
        this.letter = letter;
    }

    public void printStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letter);
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {

        Star_Constructor star = new Star_Constructor("@");
        int n = 5;
        star.printStar(n);

    }
}