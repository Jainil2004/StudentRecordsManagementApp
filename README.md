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
