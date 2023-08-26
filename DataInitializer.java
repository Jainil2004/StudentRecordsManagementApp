public class DataInitializer {
    public static Course[] initializeCourses() {
//        course initialization method providing an array of all the avaliable courses for students to enroll into.

//        initialization of the faculties for the courses.
        Faculty OOPsFaculty = new Faculty("Deepak Kumar Sharma", 800702687, new String[]{"OOPs"});
        Faculty BDAFaculty = new Faculty("Tarandeep Kaur Bhatia", 800709522, new String[]{"Big Data Analytics"});
        Faculty BDIFaculty = new Faculty("Surbhi Saraswat", 800704597, new String[]{"Big Data Ingestion"});
        Faculty DAAFaculty = new Faculty("Yeshwant Singh", 800703325, new String[]{"Design and Analysis of Algorithm"});
        Faculty PPLFaculty = new Faculty("Rajesh Kumar Mundotiya", 800708765, new String[]{"Principles of Programming Language"});
        Faculty DisMFaculty = new Faculty("Susmay Nandi", 800701468, new String[]{"Discrete Mathematics"});

        Course[] courses = new Course[15]; // current max limit of the no. of courses allowed in the program.

//        Initialization of courses
        courses[0] = new Course("CSEG2016", "Object Oriented Programming", OOPsFaculty, 2016);
        courses[1] = new Course("CSBD2005", "Big Data Analytics", BDAFaculty, 2005);
        courses[2] = new Course("CSBD2006", "Big Data Ingestion", BDIFaculty, 2006);
        courses[3] = new Course("CSEG2021", "Design and Analysis of Algorithms", DAAFaculty, 2021);
        courses[4] = new Course("CSEG1011", "Principles of Programming Language", PPLFaculty, 1011);
        courses[5] = new Course("CSEG1015", "Discrete Mathematics", DisMFaculty, 1015);

        return courses;
    }

    public static Student[] initializeStudents() {
//        Students initialization method providing an array of all the student objects.
        Student[] students = new Student[50]; // current max limit of the no. of students allowed in the program
        students[0] = new Student("Ballu Singh", 500107682);

        return students;
    }
}
