import java.util.PriorityQueue;

public class MyHash {
    public static void main(String[] args) {
        LetsMakeHash myhash = new LetsMakeHash();

    }
}

class LetsMakeHash {

    private int size = 10000;
    private int table[] = new int[size];

    public LetsMakeHash() {
    }

    public LetsMakeHash(int size) {
        this.size = size;
    }

    public int hash(String key) {
        int asciisum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciisum += key.charAt(i);
        }
        return asciisum % size;
    }

    public void insert(String key, int value) {
        int n = hash(key);
        table[n] = value;
    }

    public int search(String key) {
        return table[hash(key)];
    }
}
