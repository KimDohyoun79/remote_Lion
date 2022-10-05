package W3_D2_221005.Listpractice;

import java.util.List;

public class listPracticeMain {

    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();

        for (String student : students){
            System.out.println(student);
        }
    }
}
