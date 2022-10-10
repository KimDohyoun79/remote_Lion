package W3_D3_221006.ReadFile;

import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        
//            // #1 fileReader 활용
//        FileReader reader = new FileReader("a_file.txt");
//
//        int ch;
//        while ((ch = reader.read()) != -1) {
//            System.out.print((char) ch);
//        }

//            // #2 BufferedReader
//        BufferedReader reader =new BufferedReader(new FileReader("a_file.txt"));
//
//        String str;
//        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
//        }
//        reader.close();


        ReadOneByte readFileOneByte = new ReadOneByte("a_file.txt");
        System.out.println(readFileOneByte.readByte());

    }
}
