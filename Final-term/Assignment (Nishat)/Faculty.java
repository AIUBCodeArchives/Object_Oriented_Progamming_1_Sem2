package Assignment;

public class Faculty {
    public int facultyId;
    public String facultyName;
    public String facultyPosition;

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public Faculty() {
        System.out.println("Without parameter");
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    public String getFacultyPosition() {
        return facultyPosition;
    }

    
    public String toString() {
        return "Faculty Name: " + facultyName + "FacultyId: " + facultyId + "Faculty position: " + facultyPosition;
    }
}
