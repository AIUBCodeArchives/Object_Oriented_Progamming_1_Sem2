package Assignment;

public class Course {
    public String courseId;
    public String courseTitle;
    public double credit;

    int numberOfStudents = 100;
    Student[] StudentList;
    Faculty[] faculty;
    static int x = 0;
    static int facultyCount = 0;

    public Course() {
        System.out.println("Without parameter");
    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String toString() {
        return "A";
    }

    public void addStudent(Student a) {
        StudentList[x++] = new Student(a.studentId, a.studentName, a.studentCGPA);

    }

    public void DropStudent(int StudentId) {
        for (int i = 0; i < StudentList.length; i++) {
            if (StudentList[i].studentId == StudentId) {
                for (int j = i; j < StudentList.length - 1; j++) {
                    StudentList[j].studentCGPA = StudentList[j + 1].studentCGPA;
                    StudentList[j].studentName = StudentList[j + 1].studentName;
                    StudentList[j].studentId = StudentList[j + 1].studentId;

                }
                x--;
            }
        }

    }

    public void AddFaculty(Faculty b) {
        faculty[facultyCount++] = new Faculty(b.facultyId, b.facultyName, b.facultyPosition);

    }

    public void DropFaculty(int fid) {
        for (int i = 0; i < faculty.length; i++) {
            if (faculty[i].facultyId == fid) {
                for (int j = i; j < faculty.length - 1; j++) {
                    faculty[j].facultyId = faculty[j++].facultyId;
                    faculty[j].facultyName = faculty[j++].facultyName;
                    faculty[j].facultyPosition = faculty[j++].facultyPosition;

                }
                facultyCount--;
            }

        }
    }

    public void printStudentList() {
        for (int i = 0; i < StudentList.length; i++) {
            System.out.println(StudentList.toString());
        }
    }
}
