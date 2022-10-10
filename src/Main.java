import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {

        File file = new File("./test.txt");

        try{
            if(!file.exists()) {
                file.createNewFile();
                System.out.println("created");
            }
            else
                System.out.println("already exists");
        }catch (IOException e){
            e.printStackTrace();
        }

        BufferedWriter writer = new BufferedWriter((new FileWriter(file)));
        writer.write("dd\n");
        writer.write("dd");

        writer.flush(); // 버퍼의 남은 데이터를 모두 쓰기
        writer.close(); // 스트림 종료
    }
}
