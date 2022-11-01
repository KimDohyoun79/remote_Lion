import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    public PopulationMove parse(String data) {
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[1]);
    }

    public List<PopulationMove> readByLine(String fileName) throws IOException {

        //  filereader는 1byte씩 데이터를 메모리에 올리기 때문에 대용량 파일에서는 비효율 적인다.
//        FileReader fileReader = new FileReader(fileName);
//        char c = (char) fileReader.read();
//        System.out.println(c);

        // filrreader 로 한 바이트씩 읽는 것이 아니라 삽으로 퍼서 모래를 옮기듯이 라인 단위로 파일 처리함

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String str;
        PopulationMove pm;
        while ((str = br.readLine()) != null) {
            pm = parse(str);
            pml.add(pm);
        }
        br.close();

        return pml;
    }

    //try catch 활용
    public void readByLine2(String fileName) throws IOException {

        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter((new FileWriter(file)));
            for (String str : strs) {
                writer.write(str);
            }
           // writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String fromToString(PopulationMove pm) {
        return pm.getFromSido() + "," + pm.getToSido() + "\n";
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();

        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            moveCntMap.put(key, moveCntMap.getOrDefault(key, 0) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {
        String fileName = ".\\2021_인구관련연간자료_20220927_66125.csv";
//        String fileName = "./from_to.txt";
        PopulationStatistics reader = new PopulationStatistics();
        List<PopulationMove> pml = reader.readByLine(fileName);
        

        // 결과 파일로 재가공
        String cntfile = "each_sido_cnt.txt";
        reader.createAFile(cntfile);

        Map<String, Integer> moveCntMap = reader.getMoveCntMap(pml);
        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) {
            String s = String.format("key: %s value: %d\r\n", key, moveCntMap.get(key));
            cntResult.add(s);
        }

        //System.out.println(cntResult);
        reader.write(cntResult, "./each_sido_cnt.txt");

//        // 결과 파일 만들기
//        List<String> strings = new ArrayList<>();
//        for (PopulationMove pm : pml){
//            String fromTo = reader.fromToString(pm);
//            strings.add(fromTo);
//        }
//        reader.write(strings,"./from_to.txt");
    }
}
