import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();
        System.out.println(files[0]);
    }
}
