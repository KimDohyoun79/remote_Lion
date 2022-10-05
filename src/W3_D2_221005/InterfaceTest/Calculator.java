package W3_D2_221005.InterfaceTest;

public class Calculator {

    NumberCreator numberCreator ;

    public Calculator(ByPassNumberCreator byPassNumberCreator) {
        this.numberCreator = byPassNumberCreator;
    }

    public void plus(int num){
        System.out.println(num + numberCreator.make(10));
    }
}
