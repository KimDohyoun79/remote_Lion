package Week6.W6_D2_221025_6;

public class MyHash {
    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        LetsMakeHash myhash = new LetsMakeHash(200);

        for (int i = 0; i < names.length; i++) {
            if( myhash.search(names[i]) != 0){
                System.out.println(myhash.hash(names[i]));
            }
            myhash.insert(names[i], myhash.hash(names[i]));
        }
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
