package Week3.W3_D2_221005.Constructor;



public class RandomNumber {
    static int a;
    static int ran = (int) (Math.random() * 10);

    public RandomNumber() {
        System.out.println("random num : " + ran);
    }

    public RandomNumber(int a) {
        this.a = a;
        System.out.println("random num : " + ran);
    }

    public void set_num(int a) {
        this.a = a;
    }

    public void plus() {
        System.out.println(a + ran);
    }

    public void minus() {
        System.out.println(a - ran);
    }

    public void multiple() {
        System.out.println(a * ran);
    }

    public void divide() {
        try {
            System.out.println(a / ran);
        }catch (Exception e){
            System.out.println("0");
        }
    }

    public void divide2() {
        try {
            System.out.println((float) a / ran);
        }catch (Exception e){
            System.out.println("0");
        }
    }
}

