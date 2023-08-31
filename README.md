# StudentRecordsManagementApp
In this project, I have depicted the use of OOPs in Java and the various features it offers.

v1.0.0-alpha (Aug 24th, 2023): 
1. NEW : added the main program (StudentManagementApp.java) to the repo.
2. The program is yet not capable of doing anything other then read the test input.


v1.0.0-alpha1 (Aug 26th, 2023):
1. NEW : added the Student Class to the repo.
2. NEW : The Class provides the main Structure of the Project by effectively offering various methods for data abstraction and Storage.
3. main methods in the class -
   1. Constructor (for initializing the objects of the class)
   2. setGrades (allowing the user to input the grades in the courses enrolled by the user)
   3. calculateGPA (for calculation of SGPA using the data provided through the setGrades method)
   4. displayInfo (to display the SAPID, Student Name and the SGPA)
   5. enrolledCourses (for enrolling the Student in a specific course)
   6. listCourses (to display all the courses the Student is enrolled in)
4. UPDATED : Changed the Main program to accomodate the changes.
for better understanding of all the methods and how they work. please check out the code where I've made comments
explaining in brief the functioning of all the different methods mentioned above.


v1.0.0-alpha2 (Aug 27th, 2023):
1. NEW : added the DataInitializer Class to the repo.
2. NEW : the Class Initializes the main components of the program by giving the user access to the various course instances.
3. This class offers the initial data storage and maintenance of all the student objects and the various courses.
4. main methods in the class - 
   1. initializeCourses (for initializing the core courses for the program)
   2. initializeStudents (for initializing the test student object for the program for testing and other purposes)
5. UPDATED : Improved the Main program to accomodate the new DataInitializer class.
6. UPDATED : made changes in the Student class for better functioning.
   1. added a new method getSapId (for locating an specific student object)
   2. improved the listCourses to tackle the edge case if the student is not enrolled in any course.
7. NEW : added a basic menu driven UI in the main program.
With v1.0.0-alpha2 the program is now offers limited functionability. Using the Menu driven UI users can now perform some functions.
for better understanding of the program working. Please check out the code where I've made comments explaining in brief
the functioning of all the new and updated features added in this update.


v1.0.0-alpha3 (Aug 21st, 2023):
1. NEW : added the Faculty class to the repo
2. NEW : the class offers various methods to store/retrieve information about the faculty object used in the DataInitializer class.
3. This class acts as subpart of the two main classes in the program the Student and Course class.
4. main methods in the class -
   1. Constructor (for initializing the Faculty object)
   2. associateCourses (method to associate the specific faculty object to an already existing Course object)
   3. displayInfo (method for displaying general details about an faculty object)
   4. displayCoursesTaught (method to display the courses taught by the faculty)
   5. getFacultyName (method to return the faculty objects name)
5. NEW : added the Course Class to the repo
6. NEW : this class offers connectivity between the Student and the Faculty Class and also offers data abstraction and storage of various course objects.
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
UPDATED : made changes in the main program and the data intializer class to work efficiently with the Faculty and Course Classes.
UPDATED : made changes in the Student Class
   1. added a new method called addGPA which adds GPA of a students based on the courses enrolled and is designed to work concurrently with the setGrades method
   2. added a new method called removeCourse to de-associate a course which was in past enrolled by the student.
   3. added a new method called isEnrolledInCourse to check whether the student is enrolled in a specific course or not.
with v1.0.0-alpha3 the main Structure and working of the program is ready. the Main program still remains inoperable/offers limited functionability.
As even though the the sub-programs/classes are working and are linked together to work in synchronization the menu-driven UI is still in active development.
other than that all the methods in the program are now fully operational.
for better understanding of the program working. please check out the code where I've made comments explaining in brief the functioning of all the new and updated features added in this update. 
