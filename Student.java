import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String name; // private - sets the name variable to be only usable in the Student class
    private int sapId;
    private double[] grades;
    private ArrayList<Course> coursesEnrolled; //ArrayList to keep track of all the courses a student enrolled in

//    constructor function
    public Student(String name, int sapId) {
        this.name = name; // this is used to initialize the name to the object.
        this.sapId = sapId;
        this.grades = new double[5];
        this.coursesEnrolled = new ArrayList<>();
    }

//    associates the student and the courses together.
    public void enrolledCourses(Course course) {
        coursesEnrolled.add(course);
        course.addStudent(this);
    }

//    Grades setter method.
    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public void addGPA() {
        double[] originalGPA = new double[coursesEnrolled.size()];
        double GPAaccquired;
        byte iterator = 0;

        /* LOGIC
        * we create a temp array that can store all the values entered by the user
        * then we call the setGrades method to get all the values in the class variable.
        * then we call the calculateGPA method to calculate the GPA of the Student*/

        for (Course course : coursesEnrolled) {
            System.out.println("Score (0 - 5) in " + course.getCourseCode() +" - "+ course.getCourseName() + " course = ");
            GPAaccquired = scanner.nextDouble();
            scanner.nextLine();
            originalGPA[iterator] = GPAaccquired;
            iterator++;
        }
        setGrades(originalGPA);
    }

//    SGPA Calculator method.
    public double calculateGPA() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total/ grades.length;
    }

//    sapId retriever method for locating an specific student object
    public int getSapId() {
        return sapId;
    }

    public void removeCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    //    display relevant information about the student.
    public void displayInfo() {
        System.out.println("SAP ID: " + sapId);
        System.out.println("Student Name: " + name);
        System.out.println("SGPA: " + calculateGPA() + "\n");
    }

//    list all the courses the student enrolled in.
    public void listCourses() {
        System.out.print("SAPID = " + getSapId() + "\n");
        System.out.print("Courses enrolled in: \n");

        boolean hasenrolledCourses = false;

        for (Course course : coursesEnrolled) {
            if (course != null) {
                System.out.print(course.getCourseCode() + " - " + course.getCourseName() + "\n");
                hasenrolledCourses = true;
            }
        }
        if (!hasenrolledCourses) {
            System.out.println("Student is not enrolled in any course");
        }
    }

//    method to check if the particular student is enrolled in a specific course or not
    public boolean isEnrolledInCourse(Course course) {
        for (Course enrolledCourse : coursesEnrolled) {
            if (enrolledCourse != null && enrolledCourse.equals(course));
            return true;
        }
        return false;
    }
}
