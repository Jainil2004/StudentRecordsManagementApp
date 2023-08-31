import java.util.ArrayList;

public class Course {
    private String courseCode; // course code associated with a course manually allocated by main admin
    private int courseId; // course ID associated with the object
    private String courseName; // name of the course
    private Faculty faculty; // faculty object associated with a specific course.
    private ArrayList<Student> studentsEnrolled; // list of all the students enrolled in a particular course
    private Course[] avaliableCourses; // list of all the avaliable courses for a student to enroll into

//    constructor method
    public Course(String courseCode, String courseName, Faculty faculty, int courseId) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.faculty = faculty;
        this.studentsEnrolled = new ArrayList<>();
        this.avaliableCourses = avaliableCourses;

    }

//    method to associate a specific student to a course object
    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

//    method to retrieve the coursecode
    public String getCourseCode() {
        return courseCode;
    }

//    method to retrieve the course id
    public int getCourseId() {
        return courseId;
    }

//    method to retrieve the course name of a course object
    public String getCourseName() {
        return courseName;
    }

//    method to retrieve the faculty associated with a course object
    public Faculty faculty() {
        return faculty;
    }

//    method to remove the student from a particular course
    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
        student.removeCourse(this); // remove the course from the students list.
    }

//    method to display all the courses avaliable for enrollment
    public void listAvaliableCourses() {
        for (Course course: avaliableCourses) {
            System.out.println(course.getCourseCode()+ " - " + course.getCourseName());
        }
    }

//    method to display all the details about the course
    public void courseDetails() {
        System.out.println("Course Details: ");
        System.out.println("Course Code: "+ courseCode +
                            "\nCourse Name: "+ courseName +
                            "\nFaculty: " + faculty.getFacultyName());
    }
}
