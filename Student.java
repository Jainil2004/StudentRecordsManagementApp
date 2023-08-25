import java.util.ArrayList;

public class Student {
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

//    SGPA Calculator method.
    public double calculateGPA() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total/ grades.length;
    }

//    display relevant information about the student.
    public void displayInfo() {
        System.out.println("SAP ID: " + sapId);
        System.out.println("Student Name: " + name);
        System.out.println("SGPA: " + calculateGPA());
    }

//    list all the courses the student enrolled in.
    public void listCourses() {
        System.out.print("Courses enrolled in : ");
        for (Course course : coursesEnrolled) {
            System.out.print(course.getCourseCode() + " - " + course.getCourseName());
        }
        System.out.println("\n");
    }
}
