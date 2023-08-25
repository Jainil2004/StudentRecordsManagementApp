import java.util.Arrays;

public class StudentManagementApp {
    public static void main(String[] args) {
        System.out.println("The Goal of this Project is to depict the use os OOPs in Java\n");
        Course[] courses = DataInitializer.initializeCourses();
        Student[] students = DataInitializer.initializeStudents();
        Course[] avaliableCourses = courses.clone();
        System.out.println("Avaliable Courses");
        for (Course course : avaliableCourses) {
            System.out.println(course.getCourseCode() + " - " + course.getCourseName());
        }

//        System.out.println(avaliableCourses);
//        courses[0].courseDetails();
//        courses[1].courseDetails();
//        courses[2].courseDetails();
//
//        students[0].displayInfo();
//        students[0].enrolledCourses(courses[1]);
//        students[0].listCourses();

    }
}
