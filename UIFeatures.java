import java.util.ArrayList;
import java.util.Random;

public class UIFeatures {
    static ArrayList<Integer> generatedSAPIDs = new ArrayList<>();
    public static void displayAvaliableCourses(Course[] avaliableCourses) {
        for (Course course : avaliableCourses) {
            if (course != null) {
                System.out.println(course.getCourseCode() + " - " + course.getCourseName());
            }
        }
        System.out.print("\n");
    }

    public static Student getStudentById(Student[] students, int id) {
        for (Student student : students) {
            if (student != null && student.getSapId() == id) {
                System.out.print("SAPID = "+ student.getSapId() + " found \n");
                return student;
            }
        }
        return null;
    }

    public static byte getCourseById(Course[] courses, int courseId) {
        byte count = 0;
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public static boolean SAPIDChecker(int id) {
        String temp = String.valueOf(id);
        int startNumber = 50010;
        String temp2 = String.valueOf(startNumber);
        boolean result = temp.startsWith(temp2);

        if (result) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int generateSAPID() {
        int startNumber = 50010;
        Random random = new Random();
        int uniqueIdentifier;
        do {
            uniqueIdentifier = random.nextInt(9000) + 1000;
            int ID = Integer.parseInt(String.valueOf(startNumber) + uniqueIdentifier);

            if (!generatedSAPIDs.contains(ID)) {
                generatedSAPIDs.add(ID);
                return ID;
            }
        }while(true);
    }

    public static void operationsPanel() {
        System.out.println("Available Operations:");
        System.out.println("1. newStudent - Add a new student");
        System.out.println("2. displayAllStudents - Display all students");
        System.out.println("3. searchStudentById - Search for a student by SAP ID");
        System.out.println("4. availableCourses - Display available courses");
        System.out.println("5. enrolledCourses - Enroll in a course or list enrolled courses");
        System.out.println("6. courseDetails - View details of a course");
        System.out.println("7. viewEnrolledStudents - View students enrolled in a course");
        System.out.println("8. addGPA - Add or calculate GPA/CGPA for a student");
        System.out.println("9. removeStudentFromCourse - Remove a student from a course");
        System.out.println("11. reprintOperations - reprint this panel");
        System.out.println("10. Exit - Exit the program");
    }
}

// advanced search {completed}
// data validation {in progress}
// User authentication {scheduled}
// data persistence. {later stage}
// auto SAPID verifier and generator {completed}
// view enrolled students in a particular course {completed}
// Remove student from a particular course {completed}
// GPA adder {completed}


