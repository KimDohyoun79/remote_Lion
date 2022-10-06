package W3_D3_221006.HashMap_AlphabetCnt;

public class AlphabetCnt {

    public static boolean isAlphabet(char word){

        if (('A' <= word) && (word <= 'Z') || ('a' <= word) && (word<= 'z')){
            return true;
        } else{
            return false;
        }
    }
}
