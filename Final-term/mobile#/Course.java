import java.util.*;

public class Course {
    String name;
    
    private List<Student> students;
    Course(String name, List<Student> students){
        this.name = name;
        this.students = students;
    }

    public List<Student> studentData(){
        return students;
    }
}
