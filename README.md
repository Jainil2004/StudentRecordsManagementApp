# StudentRecordsManagementApp
Student Management System

**Description**:
The Student Management System is a Java-based application designed to efficiently manage student data, course information, and academic records for educational institutions. This system provides a user-friendly command-line interface for administrators to perform various tasks related to student enrollment, course management, and academic performance tracking.

**Key Features**:
1. **Student Registration**: Easily add new students to the system by providing their name and generating a unique SAP ID automatically.

2. **Student Information Lookup**: Search and retrieve detailed information about a specific student by their SAP ID.

3. **Course Management**: View available courses and enroll students in specific courses.

4. **Course Details**: Access comprehensive information about each course, including course code, name, and enrolled students.

5. **Academic Performance**: Add and calculate GPAs for students. Calculate and display Cumulative Grade Point Averages (CGPAs).

6. **Student-Course Interaction**: Enroll or remove students from courses, view enrolled students in a particular course, and manage their academic progress.

7. **Data Persistence**: Save student and course data to enable data retrieval and management across sessions.

8. **User Authentication** (future feature): Implement user authentication to secure system access.

9. **Database Integration** (future feature): Integrate with databases like MongoDB or export data to JSON for efficient data storage and retrieval.

**Purpose**:

The Student Management System simplifies administrative tasks related to student enrollment and academic record-keeping. It streamlines the process of managing student data, making it easier for educational institutions to maintain accurate records and monitor student progress. Future enhancements will include user authentication and database integration for enhanced security and data storage capabilities.

**Usage**:

This system is intended for educational institutions such as schools, colleges, and universities, as well as any organization that needs a robust system for managing student data and academic records efficiently.

**Note**: You can further tailor the project description to match specific goals, objectives, and requirements of your project.

**VERSIONS**:

**v1.0.0-alpha (Aug 24th, 2023)**: 
1. NEW : added the main program (StudentManagementApp.java) to the repo.
2. The program is yet not capable of doing anything other then read the test input.


**v1.0.0-alpha1 (Aug 26th, 2023)**:
1. **NEW** : added the Student Class to the repo.
2. **NEW** : The Class provides the main Structure of the Project by effectively offering various methods for data abstraction and Storage.
3. main methods in the class -
   1. Constructor (for initializing the objects of the class)
   2. setGrades (allowing the user to input the grades in the courses enrolled by the user)
   3. calculateGPA (for calculation of SGPA using the data provided through the setGrades method)
   4. displayInfo (to display the SAPID, Student Name and the SGPA)
   5. enrolledCourses (for enrolling the Student in a specific course)
   6. listCourses (to display all the courses the Student is enrolled in)
4.**UPDATED**: Changed the Main program to accomodate the changes.
for better understanding of all the methods and how they work. please check out the code where I've made comments
explaining in brief the functioning of all the different methods mentioned above.


**v1.0.0-alpha2 (Aug 27th, 2023)**:
1. **NEW** : added the DataInitializer Class to the repo.
2. **NEW** : the Class Initializes the main components of the program by giving the user access to the various course instances.
3. This class offers the initial data storage and maintenance of all the student objects and the various courses.
4. main methods in the class - 
   1. initializeCourses (for initializing the core courses for the program)
   2. initializeStudents (for initializing the test student object for the program for testing and other purposes)
5. **UPDATED** : Improved the Main program to accomodate the new DataInitializer class.
6. **UPDATED** : made changes in the Student class for better functioning.
   1. added a new method getSapId (for locating an specific student object)
   2. improved the listCourses to tackle the edge case if the student is not enrolled in any course.
7. **NEW** : added a basic menu driven UI in the main program.
With v1.0.0-alpha2 the program is now offers limited functionability. Using the Menu driven UI users can now perform some functions.
for better understanding of the program working. Please check out the code where I've made comments explaining in brief
the functioning of all the new and updated features added in this update.


**v1.0.0-alpha3 (Aug 31st, 2023)**:
1. **NEW** : added the Faculty class to the repo
2. **NEW** : the class offers various methods to store/retrieve information about the faculty object used in the DataInitializer class.
3. This class acts as subpart of the two main classes in the program the Student and Course class.
4. main methods in the class -
   1. Constructor (for initializing the Faculty object)
   2. associateCourses (method to associate the specific faculty object to an already existing Course object)
   3. displayInfo (method for displaying general details about an faculty object)
   4. displayCoursesTaught (method to display the courses taught by the faculty)
   5. getFacultyName (method to return the faculty objects name)
5. **NEW** : added the Course Class to the repo
6. **NEW** : this class offers connectivity between the Student and the Faculty Class and also offers data abstraction and storage of various course objects.
7. the class stores all the information about the faculty associated with a particular course and all the students enrolled in the specific course.
8. main methods in the class -
   1. Constructor (for initializing the Course Object)
   2. addStudent (for associating or enrolling a specific student to a particular course object)
   3. getCourseCode (used to return the course code of a Course object)
   4. getCourseID (used to return the course ID of a Course object)
   5. getCourseName (used to return the course name of a Course object)
   6. removeStudent (for de-assocaiting a Student object from a particular Course Object)
   7. listAvaliableCourses (method to display all the course avaliable for enrollment)
   8. courseDetails (method to display all the general information about a Course object)
9. **UPDATED** : made changes in the main program and the data intializer class to work efficiently with the Faculty and Course Classes.
10. **UPDATED** : made changes in the Student Class
   1. added a new method called addGPA which adds GPA of a students based on the courses enrolled and is designed to work concurrently with the setGrades method
   2. added a new method called removeCourse to de-associate a course which was in past enrolled by the student.
   3. added a new method called isEnrolledInCourse to check whether the student is enrolled in a specific course or not.
with v1.0.0-alpha3 the main Structure and working of the program is ready. the Main program still remains inoperable/offers limited functionability.
As even though the the sub-programs/classes are working and are linked together to work in synchronization the menu-driven UI is still in active development.
other than that all the methods in the program are now fully operational.
for better understanding of the program working. please check out the code where I've made comments explaining in brief the functioning of all the new and updated features added in this update. 


**v1.0.0-alpha4 (Sept 2, 2023)**:
1. **NEW** : added the UIFeatures Class
2. **NEW** : the class is one of the main sub-programs which doesnt provide any specific functionallity to the main program. but it is there to simplify the inter-conversation between the different components of the project i.e other core classes like Student, Faculty and Course.
3. the whole purpose of this class is to simplify the the UI so that it is not intimidating for the user to use the program.
4. the class also provides abstraction or acts as a upper level over the core classes such that the user doesnt have direct access or is not interacting with the core classes directly. instead the user it asking the UIFeatures to talk to the core classes for it.
5. communication between the main program and the sub-classes is solely through the UIFeatures class.
main methods in the class -
   1. displayAvaliableCourses (to display all the courses that a student can enroll into)
   2. getStudentById (to locate a specific student object using the SAPID for further operations)
   3. getCourseByID (to locate a specific course object using the courseID for further operations)
   4. SAPIDChecker (to verify a student object exists with the given SAPID)
   5. generateSAPID (to generate a new unique identification SAPID for the student object)
   6. operationsPanel (for displaying all the operations that are avaliable to the user)
with v1.0.0-alpha4 the project is now fully functional and all of its features are now avaliable for the user to use. with the integration of the UIFeatures class the program and its structure is complete with only non-essential but quality of life features remaining some of which are in development and the others are also scheduled to enter active development phase in the near future.
for better understanding of the program working. Please check out the code where I've made comments explaining in brief the functioning of all the new and updated features added in this update.


**[LATEST UPDATE] v1.0.0-beta (Sept 2, 2023)**:
1. **UPDATED** : updated the main program to integrate the UIFeatures class and simplified the command-line UI.
2. **UPDATED** : improved the Data validation system so as to react to exceptions efficiently.
v1.0.0-beta improves the command line UI in the project while also simplfying it. I have also introduced various data validation checks in the program so as to deal with exceptions efficiently and to ensure that the program works as intended.
