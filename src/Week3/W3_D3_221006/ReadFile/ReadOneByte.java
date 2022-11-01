package Week3.W3_D3_221006.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadOneByte {

    private String filename;
    int readNByte = 0;
    public ReadOneByte(String filename) {
        this.filename = filename;
    }

    char readByte() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        //return (char)br.read();

        int brnum;
        while ((brnum = br.read()) != -1) {
            if(readNByte-- == 0)
                break;
            System.out.print((char) brnum);
        }
        return (char)br.read();
    }
}
