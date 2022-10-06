import W3_D3_221006.HashSet_Alpa.NumberGenerator;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public char generate(int num) {
        return (char)(Math.random() * num + 65); // A~Z 생성
    }
}
