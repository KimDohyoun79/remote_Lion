package W3_D2_221005.InterfaceTest;



public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new ByPassNumberCreator());
        calculator.plus(10);
    }
}
