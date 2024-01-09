import java.util.*;

public class College {
    String collegeName;
    private List<Course> courses;

    public College(String collegeName, List<Course> courses) {
        this.collegeName = collegeName;
        this.courses = courses;
    }

    public int countStudent() {
        int studentInCollege = 0;
        for (Course course : courses) {
            List<Student> students = course.studentData();
            for (Student student : students) {
                studentInCollege++;
            }
        }
        return studentInCollege;
    }
}
