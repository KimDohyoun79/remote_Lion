package W3_D3_221006.ListReview;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("김도현");
        this.students.add("김두현");
        this.students.add("김다현");
        this.students.add("김대현");
        this.students.add("김디현");
    }

    public List<String> getStudents(){
        return this.students;
    }
}
