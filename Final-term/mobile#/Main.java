import java.util.*;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Doggy", 101, "CSE");
        Student s2 = new Student("Sami", 102, "CS");
        Student s3 = new Student("Avoy", 103, "Poly");
        Student s4 = new Student("Sifti", 104, "CSE");
        Student s5 = new Student("Udoy", 105, "poly");
    
        List<Student> cse_students = new ArrayList<Student>();
        cse_students.add(s1);
        cse_students.add(s4);

        List <Student> cs_students = new ArrayList<Student>();
        cs_students.add(s2);

        List <Student> poly_students = new ArrayList<Student>();
        poly_students.add(s3);
        poly_students.add(s5);

        Course CSE = new Course("CSE", cse_students);
        Course CS = new Course("CS", cs_students);
        Course Poly = new Course("Poly", poly_students);

        List <Course> courses = new ArrayList<Course>();
        courses.add(CSE);
        courses.add(CS);
        courses.add(Poly);

        College collge = new College("ABED", courses);

        System.out.println("Total number of students in the college "+ collge.collegeName+" is : "+collge.countStudent());
    }
}
