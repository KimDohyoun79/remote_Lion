package W3_D4_221007.StarFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PopulationStatistics {

    public PopulationMove parse(String data){
        String[] splittedLine = data.split(",");
        return new PopulationMove(Integer.parseInt(splittedLine[0]), Integer.parseInt(splittedLine[6]));
    }

    public List<PopulationMove> readByLine(String fileName) throws IOException {

          //  filereader는 1byte씩 데이터를 메모리에 올리기 때문에 대용량 파일에서는 비효율 적인다.
//        FileReader fileReader = new FileReader(fileName);
//        char c = (char) fileReader.read();
//        System.out.println(c);

        // filrreader 로 한 바이트씩 읽는 것이 아니라 삽으로 퍼서 모래를 옮기듯이 라인 단위로 파일 처리함
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String s;
        PopulationMove populationMove;
        while ((s = br.readLine()) != null) {
            populationMove = parse(s);
            System.out.println(populationMove.getFromSido() + " " + populationMove.getToSido());
        }
        br.close();

    }

    public void readByLine2(String fileName) throws IOException {

        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) throws IOException {
        String fileName = ".\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics reader = new PopulationStatistics();

        List<PopulationMove> pml = reader.readByLine(fileName);

        for(PopulationMove pm : pml){
            System.out.printf("전입 : %s, 전출 %s\n", pm.getFromSido(), pm.getToSido());
        }
        System.out.println(pml.size());


//        BufferedReader br = new BufferedReader(new FileReader(fileName));
//
//        HashMap<String, Integer> fromS = new HashMap();
//        String s;
//        while ((s = br.readLine()) != null) {
//
//            String [] s1 = s.split(",");
//
//            if(s1[6].equals("11")){
//                fromS.put(s1[6], fromS.getOrDefault(s1[0], 0) + 1);
//            }
//
//            System.out.println(fromS);
//        }

    }
}
