package Assignment;

import java.util.ArrayList;

public class Student {
    public int studentId;
    public String studentName;
    public double studentCGPA;

    Student() {
        System.out.println("Without parameter");
    }

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentCgpa(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    public double getStudentCgpa() {
        return studentCGPA;
    }

    

    public String toString() {
        return "Student Name: " + studentName + "Student ID: " + studentId + " Student CGPA: " + studentCGPA;

    }

}
