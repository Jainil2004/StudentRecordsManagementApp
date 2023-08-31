import java.util.ArrayList;

public class Faculty {
    private String facultyName; // name of the faculty
    private int facultyID; // system allocated ID to the faculty object
    private ArrayList<Course> coursesTaught; // all the courses that the faculty teaches

//    Constructor : for initialization of the faculty object
    public Faculty(String facultyName, int facultyID, String[] Courses) {
        this.facultyName = facultyName;
        this.facultyID = facultyID;
        this.coursesTaught = new ArrayList<>();
    }

//    courses that are associated with the faculty
    public void associateCourses(Course course) {
        coursesTaught.add(course);
    }

//    display method to list all the known details about the faculty
    public void displayInfo() {
        System.out.println("Faculty ID: " + facultyID);
        System.out.println("Faculty Name: " + facultyName);
    }

//    display method to list all the courses taught by the faculty
    public void displayCoursesTaught() {
        System.out.print("Course Taught: "+ coursesTaught +"\n");
    }

//    method to retrieve the name of the faculty.
    public String getFacultyName() {
        return facultyName;
    }
}
