import java.util.Arrays;
import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        System.out.println("The Goal of this Project is to depict the use os OOPs in Java\n");
        Course[] courses = DataInitializer.initializeCourses();
        Student[] students = DataInitializer.initializeStudents();
        Scanner scanner = new Scanner(System.in);
        String studentName, mode;
        Student temp1;
        byte courseNum;
        int studentID, selectedCourse;
        byte iterator = 1;
        int SAPID, courseID;

        System.out.println(students.length);

//        Menu Driven UI
        String operation = null;

//        while (true) {
        while (!"Exit".equals(operation)) {

            System.out.print("Please enter a operation: ");
            operation = scanner.nextLine();

            switch (operation) {
                case "newStudent":
                    System.out.print("Please enter the details of the student you want to add: \n");
                    System.out.print("Student Name: ");
                    studentName = scanner.nextLine();

                    System.out.print("Student SAP ID: ");
                    studentID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\n");

                    students[iterator] = new Student(studentName, studentID);
                    iterator++;
                    break;

                case "displayStudents":
                    for (Student student : students) {
                        if (student != null) {
                            student.displayInfo();
                        }
                    }
                    break;

                case "avaliableCourses":
                    UIFeatures.displayAvaliableCourses(courses);
                    break;

                case "enrolledCourses":
                    System.out.print("would you like to enroll in a course or list all the courses enrolled in (enrollNew / enrolledCourses): ");
                    mode = scanner.nextLine();
//                    scanner.nextLine();

                    System.out.print("SAPID of the Student: ");
                    SAPID = scanner.nextInt();
                    scanner.nextLine();
                    temp1 = UIFeatures.getStudentById(students, SAPID);

                    if ("enrollNew".equals(mode)) {
                        System.out.print("Select the Course you want to enroll into: ");
                        selectedCourse = scanner.nextByte();
                        scanner.nextLine();
                        temp1.enrolledCourses(courses[selectedCourse]);
                        System.out.print("Enrollment Successful\n");
                    }
                    else if ("enrolledCourses".equals(mode)) {
                        temp1.listCourses();
                    }
                    else {
                        System.out.print("'"+ mode + "' is not a valid operation\n");
                    }
                    break;

                case "courseDetails":
                    System.out.print("course ID: ");
                    courseID = scanner.nextInt();
                    scanner.nextLine();
                    courseNum = UIFeatures.getCourseById(courses, courseID);
                    courses[courseNum].courseDetails();
                    break;

                case "Exit":
                    System.out.println("Exiting the Program");
                    break;

                default:
                    System.out.print("**WARNING: '" + operation + "' is not a valid operation**\n");
                    break;
            }
        }
    }
}


//        System.out.println(avaliableCourses);
//        courses[0].courseDetails();
//        courses[1].courseDetails();
//        courses[2].courseDetails();
//
//        students[0].displayInfo();
//        students[0].enrolledCourses(courses[1]);
//        students[0].listCourses();
