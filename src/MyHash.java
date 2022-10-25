import java.util.PriorityQueue;

public class MyHash {
    public static void main(String[] args) {
        LetsMakeHash myhash = new LetsMakeHash();

    }
}

class LetsMakeHash{

    public int hash(String key){
        int asciisum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciisum += key.charAt(i);
        }
        return asciisum;
    }

}
