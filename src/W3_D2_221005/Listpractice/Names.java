package W3_D2_221005.Listpractice;

import java.util.ArrayList;
import java.util.List;

public class Names {
    private List<String> students = new ArrayList<>();

    private List<Student> studentObjs = new ArrayList<>();

    public List<Student> getStudentObjs(){
        this.studentObjs.add(new Student(1,"김도현", "reer"));
        return studentObjs;
    }



}
