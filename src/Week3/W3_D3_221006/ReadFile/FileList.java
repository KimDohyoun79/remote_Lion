package Week3.W3_D3_221006.ReadFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileList {

    public void printFile(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files){
            System.out.println(file);
        }
    }

    // 한글자
    public char readAchar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }

    // 두글자
    public String read2Achar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }

    // N 글자
    public String read3Achar(String filename, int N) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        for(int i =0; i <N;i++){
            int asciicd = fileReader.read();
            if(asciicd == -1)
                return str;
            str += (char) asciicd;
        }
        return str;
    }

    public static void main(String[] args) throws IOException {
        FileList fileList = new FileList();
        
        // 한글자
        char c = fileList.readAchar("a_file.txt");
        System.out.println(c);

        // 두글자
        String str = fileList.read2Achar("a_file.txt");
        System.out.println(str);

        // N글자
        String str1 = fileList.read3Achar("a_file.txt", 4);
        System.out.println(str1);
    }
}

/*
.\.git
 */