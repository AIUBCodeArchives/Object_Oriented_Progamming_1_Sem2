package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int foption;
        int addOption;
        int deleteOption;
        int getId;
        ArrayList<Student> s = new ArrayList<Student>();
        ArrayList<Course> c = new ArrayList<Course>();
        ArrayList<Faculty> f = new ArrayList<Faculty>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Button \n1.Add\n" +
                "2.Delete\n" +
                "3.Update\n" +
                "4.Print\n" +
                "5.Search");
        foption = sc.nextInt();
        switch (foption) {
            case 1: {
                System.out.println("Please select what do you want to do\n1.\tAdd a Student\n" +
                        "2.\tAdd a Course\n" +
                        "3.\tAdd a Faculty\n");
                addOption = sc.nextInt();
                switch (addOption) {
                    case 1: {
                        System.out.println("Please Enter the students ID , Name, CGPA ");
                        Student student = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
                        s.add(student);
                        System.out.println("Student saved successfully");
                        break;
                    }
                    case 2: {
                        System.out.println("Give the CourseId,CourseTitle,Credit");
                        Course course = new Course(sc.next(), sc.next(), sc.nextDouble());
                        c.add(course);
                        break;
                    }
                    case 3: {
                        System.out.println("Give the Faculty's Id,name and position");
                        Faculty faculty = new Faculty(sc.nextInt(), sc.next(), sc.nextLine());
                        f.add(faculty);
                        break;
                    }
                    default:
                        System.out.println("Not a valid input");
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("a.Delete a Student\n" +
                        "b.Delete a course \n" +
                        "c.Delete a faculty\n");
                deleteOption = sc.nextInt();
                switch (deleteOption) {
                    case 1:
                        System.out.println("Enter the Student Id of the Student");
                        getId = sc.nextInt();
                        for (int i = 0; i < s.size(); i++) {
                            if (s.get(i).studentId == getId) {
                                s.remove(i);
                            }
                        }
                        break;
                    
                    case 2: 
                        System.out.println("Enter the Course Id");
                        String getId1 = sc.next();
                        for (int i = 0; i < c.size(); i++) {
                            if (c.get(i).courseId == getId1) {
                                c.remove(i);
                            }
                        }
                        break;
                    
                    case 3: 
                        System.out.println("Enter the Faculty Id");
                        getId = sc.nextInt();
                        for (int i = 0; i < f.size(); i++) {
                            if (f.get(i).facultyId == getId) {
                                f.remove(i);
                            }
                        }
                        break;
                    
                    default: {
                        System.out.println("Invalid option.");
                    }

                }
                break;
            }
            case 3: {
                System.out.println("a.Update a Student\n" +
                        "b.Update a Course\n" +
                        "c.Update a Faculty\n");
                int updateOption = sc.nextInt();
                switch (updateOption) {
                    case 1: {
                        System.out.println("Enter the id of the student");
                        int id = sc.nextInt();
                        for (int i = 0; i < s.size(); i++) {
                            if (s.get(i).studentId == id) {
                                System.out.println("Please enter the updated id ,name and CGPA");
                                Student n = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
                                s.set(i, n);
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {
                        // here write the same code for updating a course value
                    }
                    case 3: {
                        // here write the same code for updating a faculty values
                    }
                    default: {
                        System.out.println("Not a valid option");
                    }
                }
                break;
            }
            case 4: {
                System.out.println("1.\tPrint all students\n" +
                        "2.\tPrint all course\n" +
                        "3.\tPrint all faculties\n" +
                        "4.\tPrint information of a student\n" +
                        "5.\tPrint information of a course\n" +
                        "6.\tPrint information of a faculty\n" +
                        "7.\tPrint student list and faculty information of a course\n" +
                        "8.\tPrint courses taken by a student\n");
                int printOption = sc.nextInt();
                switch (printOption) {
                    case 1: {
                        for (int i = 0; i < s.size(); i++) {
                            System.out.println(s.get(i).studentName);
                        }
                        break;

                    }
                    case 2: {
                        for (int i = 0; i < c.size(); i++) {
                            System.out.println(c.get(i).courseTitle);
                        }
                        break;
                    }
                    case 3: {
                        for (int i = 0; i < f.size(); i++) {
                            System.out.println(f.get(i).facultyName);
                        }
                        break;
                    }
                    case 4: {
                        for (int i = 0; i < s.size(); i++) {
                            System.out.println(s.get(i).toString());
                        }
                        break;
                    }
                    case 5: {
                        for (int i = 0; i < f.size(); i++) {
                            System.out.println(f.get(i).toString());
                        }
                        break;
                    }
                    case 6: {
                        for (int i = 0; i < c.size(); i++) {
                            System.out.println(c.get(i).toString());
                        }
                        break;
                    }
                    case 7: {
                        for (int i = 0; i < c.size(); i++) {
                            System.out.println("Student names");
                            for (int j = 0; j < c.get(i).StudentList.length; j++) {
                                System.out.println(c.get(i).StudentList[j].studentName);
                            }
                            System.out.println("AFaculty names");
                            for (int l = 0; l < c.get(i).faculty.length; l++) {
                                System.out.println(c.get(i).faculty[l].facultyName);
                            }
                        }
                        break;
                    }
                    case 8: {
                        // maybe printing courses taken by a student
                        // confusing so I am leaving it
                    }
                    default:
                        System.out.println("Not a valid key");
                }

                break;
            }
            case 5: {
                System.out.println(
                        "1.\tSearch a Student\n" +
                                "2.\tSearch a Course\n" +
                                "3.\tSearch a Faculty\n" +
                                "4.\tSearch whether a student takes a course\n" +
                                "5.\tSearch whether a faculty teaches a course\n" +
                                "6.\tSearch courses taken by a student\n" +
                                "7.\tSearch courses taught by a faculty\n");
                int searchOption = sc.nextInt();
                switch (searchOption) {
                    case 1: {
                        System.out.println("enter the Name of student you are searching for");
                        String name = sc.next();
                        for (int i = 0; i < s.size(); i++) {
                            if (s.get(i).studentName == name) {
                                System.out.println("Student is here");
                                break;
                            } else {
                                System.out.println("Student is not here");
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.println("enter the Name of course you are searching for");
                        String name = sc.next();
                        for (int i = 0; i < s.size(); i++) {
                            if (c.get(i).courseTitle == name) {
                                System.out.println("Course is here");
                                break;
                            } else {
                                System.out.println("Course is not here");
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("enter the Name of faculty you are searching for");
                        String name = sc.next();
                        for (int i = 0; i < s.size(); i++) {
                            if (f.get(i).facultyName == name) {
                                System.out.println("Faculty is here");
                                break;
                            } else {
                                System.out.println("Faculty is not here");
                            }
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the student name to know if he takes this course or not");
                        String name = sc.next();
                        System.out.println("Enter the course name");
                        String coursename = sc.next();
                        for (int i = 0; i < c.size(); i++) {
                            if (c.get(i).courseTitle == coursename) {
                                for (int k = 0; k < c.get(i).StudentList.length; k++) {
                                    if (c.get(i).StudentList[k].studentName == name) {
                                        System.out.println("Student exist");
                                        break;
                                    } else {
                                        System.out.println("Student doesn't exists");
                                    }

                                }
                            }
                        }
                        break;
                    }
                    case 5: {
                        System.out.println("Enter the faculty name to know if he takes this course or not");
                        String name = sc.next();
                        System.out.println("Enter the course name");
                        String coursename = sc.next();
                        for (int i = 0; i < c.size(); i++) {
                            if (c.get(i).courseTitle == coursename) {
                                for (int k = 0; k < c.get(i).StudentList.length; k++) {
                                    if (c.get(i).StudentList[k].studentName == name) {
                                        System.out.println("Faculty exist");
                                        break;
                                    } else {
                                        System.out.println("Faculty doesn't exists");
                                    }

                                }
                            }
                        }
                        break;
                    }
                    case 6: {
                        System.out.println("Write the students name to find the courses taken by him");
                        String na = sc.next();
                        for (int i = 0; i < c.size(); i++) {
                            for (int j = 0; j < c.get(i).StudentList.length; j++) {
                                if (c.get(i).StudentList[j].studentName == na) {
                                    System.out.println(
                                            "The course " + c.get(i).courseTitle + " is taken by this student");
                                }
                            }
                        }
                        break;
                    }
                    case 7: {
                        System.out.println("Write the facultys name to find the courses taken by him");
                        String na = sc.next();
                        for (int i = 0; i < c.size(); i++) {
                            for (int j = 0; j < c.get(i).faculty.length; j++) {
                                if (c.get(i).faculty[j].facultyName == na) {
                                    System.out.println(
                                            "The course " + c.get(i).courseTitle + " is taken by this faculty");
                                }
                            }
                        }
                        break;
                    }

                }
            }
        }

    }
}
