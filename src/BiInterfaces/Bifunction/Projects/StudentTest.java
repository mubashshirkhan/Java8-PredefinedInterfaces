package BiInterfaces.Bifunction.Projects;
import java.util.*;
import java.util.function.BiFunction;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        // BiFunction to create Student objects
        BiFunction<String, Integer, Student> f =
                (name, rollno) -> new Student(name, rollno);

        // Creating Student objects using BiFunction
        list.add(f.apply("Durga", 100));
        list.add(f.apply("Ravi", 200));
        list.add(f.apply("Shiva", 300));
        list.add(f.apply("Pavan", 400));

        // Displaying Student details
        for (Student s : list) {

            System.out.println("Student Name: " + s.name);
            System.out.println("Student Rollno: " + s.rollno);
            System.out.println();
        }
    }
}