import java.util.Arrays;

public class StudentManagementApp {
    public static void main(String[] args) {
        System.out.println("The Goal of this Project is to depict the use os OOPs in Java");
        Student student1 = new Student("Ballu Singh", 500107682);
        student1.setGrades(new double[] { 4.0, 3.7, 3.5, 3.8, 3.9 });

        student1.displayInfo();
    }
}
