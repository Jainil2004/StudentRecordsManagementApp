import java.util.Arrays;
import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
//        System.out.println("The Goal of this Project is to depict the use of OOPs in Java\n");
        System.out.println("Welcome to the Students Records Management app");
        Course[] courses = DataInitializer.initializeCourses();
        Student[] students = DataInitializer.initializeStudents();
        Scanner scanner = new Scanner(System.in);

//        variables for proper functioning of the UI
        String studentName, mode;
        Student temp1;
        byte courseNum;
        int studentID, selectedCourse, SAPID, courseID;
        byte iterator = 1;
        boolean verifier;
        double[] grades;

//        System.out.println(students.length);

//        Menu Driven UI
        String operation = null;

        UIFeatures.operationsPanel();

//        while (true) {
        while (!"Exit".equals(operation)) {

            System.out.print("Please enter a operation: ");
            operation = scanner.nextLine();

            switch (operation) {
                case "newStudent":
                    System.out.print("Please enter the details of the student you want to add: \n");
                    System.out.print("Student Name: ");
                    studentName = scanner.nextLine();
                    if (!studentName.matches("^[A-Za-z ]+$")) {
                        System.out.println("Invalid name. Name must contain only English letters.\n");
                        break;
                    }

//                    System.out.print("Student SAP ID: ");
//                    studentID = scanner.nextInt();
//                    scanner.nextLine();
//                    System.out.print("\n");
                    studentID = UIFeatures.generateSAPID();
                    System.out.println("Student SAP ID - "+ studentID + "\n");
                    students[iterator] = new Student(studentName, studentID);
                    iterator++;
                    break;

                case "displayAllStudents":
                    for (Student student : students) {
                        if (student != null) {
                            student.displayInfo();
                        }
                    }
                    break;

                case "searchStudentById":
//                    advancedSearch
                    System.out.print("Student SAPID: ");
                    studentID = scanner.nextInt();
                    scanner.nextLine();

                    temp1 = UIFeatures.getStudentById(students, studentID);
                    if (temp1 != null) {
                        temp1.displayInfo();
                    }
                    else {
                        System.out.println("Student with SAPID = " + studentID + " not found/doesn't exist.\n");
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
                    verifier = UIFeatures.SAPIDChecker(SAPID);
                    if (verifier) {
                        temp1 = UIFeatures.getStudentById(students, SAPID);
                    }
                    else {
                        System.out.println("Invalid SAP \n");
                        break;
                    }

                    if ("enrollNew".equals(mode)) {
                        System.out.print("Select the Course you want to enroll into: ");
                        selectedCourse = scanner.nextByte();
                        scanner.nextLine();
                        if (selectedCourse > courses.length) {
                            System.out.print("\"" + selectedCourse + "\" is not a valid course number\n");
                            break;
                        }
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

                case "viewEnrolledStudents":
                    System.out.print("Enter the course ID to view enrolled students: ");
                    courseID = scanner.nextInt();
                    scanner.nextLine();
                    courseNum = UIFeatures.getCourseById(courses, courseID);

                    if (courseNum >= 0) {
                        Course selectedCourseById = courses[courseNum];
                        System.out.println("Enrolled Students in " + selectedCourseById.getCourseCode() +" - "+ selectedCourseById.getCourseName() + " course:");
                        for (Student student : students) {
                            if (student != null && student.isEnrolledInCourse(selectedCourseById)) {
                                student.displayInfo();
                            }
                        }
                    }
                    break;

                case "addGPA":
                    System.out.print("SAPID of the Student: ");
                    SAPID = scanner.nextInt();
                    scanner.nextLine();

                    verifier = UIFeatures.SAPIDChecker(SAPID);
                    if (verifier) {
                        temp1 = UIFeatures.getStudentById(students, SAPID);
                    }
                    else {
                        System.out.println("Invalid SAP ID\n");
                        break;
                    }

                    System.out.print("would you like to add or calculate CPGA for the Student (addGPA / calculateCGPA): ");
                    mode = scanner.nextLine();

                    if (mode.equals("addGPA")) {
                        temp1.addGPA();
                    }
                    else if (mode.equals("calculateCGPA")) {
                        double CGPA = temp1.calculateGPA();
                        System.out.print("SAP ID = "+ temp1.getSapId() + "\nCGPA Acquired = " + CGPA + "\n");
                    }
                    else {
                        System.out.print("'"+ mode + "' is not a valid operation\n");
                    }
                    break;

                case "removeStudentFromCourse":
                    System.out.print("SAP ID of the Student: ");
                    SAPID = scanner.nextInt();
                    scanner.nextLine();
                    verifier = UIFeatures.SAPIDChecker(SAPID);
                    if (!verifier) {
                        System.out.println("Invalid SAP ID");
                        break;
                    }
                    temp1 = UIFeatures.getStudentById(students, SAPID);

                    System.out.print("Course ID of the course to remove the student from: ");
                    courseID = scanner.nextInt();
                    scanner.nextLine();
                    courseNum = UIFeatures.getCourseById(courses, courseID);
                    if (courseNum == -1) {
                        System.out.println("Course not found\n");
                        break;
                    }

                    Course courseRemovedFrom = courses[courseNum];
                    if (!temp1.isEnrolledInCourse(courseRemovedFrom)) {
                        System.out.println("Student is not enrolled in the course\n");
                    }

                    courseRemovedFrom.removeStudent(temp1);
                    System.out.println("Student Successfully de-enrolled from the Course with id '" + courseRemovedFrom.getCourseCode()+ "'.\n");
                    break;

                case "reprintOperations":
                    UIFeatures.operationsPanel();
                    break;

                case "Exit":
                    System.out.println("Exiting the Program\n");
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
