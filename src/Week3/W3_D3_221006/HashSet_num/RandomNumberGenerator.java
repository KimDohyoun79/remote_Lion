package Week3.W3_D3_221006.HashSet_num;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int generate(int num) {
        return (int) (Math.random() * num);
    }
}
