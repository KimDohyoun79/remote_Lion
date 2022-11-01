package Week6.W6_D2_221025_6;
// 해쉬 충돌 해결01 : 해쉬(중복) 해결을 위해 Node 객체타입으로 ArrayList에 추가
// 1. 문자열을 해쉬로 전환 후 size만큼 나누어 인덱스 번호를 만들어 낸다.
// 2. 내부 클레스 Node 를 만들어 key, value를 객체로 저장한다.

import java.util.ArrayList;
import java.util.List;

public class hash03 {

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

//        HashTable02 ht = new HashTable02(200);
//        for (int i = 0; i < names.length; i++) {
//            ht.insert(names[i], ht.hash(names[i]));
//        }
//
//        System.out.println(ht.search("DongyeonKang"));
//        System.out.println(ht.search("JiyoungAhn"));

        HashTable03 ht = new HashTable03();
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);

        int result = ht.get("Yoonseo");
        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

        result = ht.get("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }
    }
}

class HashTable03 {

    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private int size = 10000;
    private List<Node>[] table = new ArrayList[size];

    public HashTable03() {
    }

    public HashTable03(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        // List
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) { // null일 때 생성
            this.table[hashIdx] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashIdx].add(new Node(key, value));
    }


    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if (key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }
}