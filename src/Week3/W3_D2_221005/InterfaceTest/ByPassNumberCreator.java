package Week3.W3_D2_221005.InterfaceTest;

public class ByPassNumberCreator  implements NumberCreator{
    @Override
    public int make(int num) {
        return num;
    }
}
