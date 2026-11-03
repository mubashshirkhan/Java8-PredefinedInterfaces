package ProjectUsingAllInterfaces;

import Predicate.EmployeeMangement.Employee;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        populate(list);

        Predicate<Student> p1 = std -> std.marks >= 60;

        Function<Student, String> f1 = std -> {
            if (std.marks <= 100 && std.marks >= 80) {
                return "A grade";
            } else if (std.marks < 80 && std.marks >= 60) {
                return "B grade";
            } else if (std.marks < 60 && std.marks >= 40) {
                return "C grade";
            } else {
                return "fail";
            }
        };

        Consumer<Student> c1 = std -> {
            System.out.println("Student: "+std.name);
            System.out.println("Marks: "+std.marks);
            System.out.println("Grade: "+f1.apply(std));//getting grade through Function f1
        };

        for(Student s: list){
            if(p1.test(s)){
                c1.accept(s);
                System.out.println();
            }

        }

    }

    public static void populate(ArrayList<Student> list) {
        list.add(new Student("Rahul", 95));
        list.add(new Student("Kiran", 82));
        list.add(new Student("Priya", 76));
        list.add(new Student("Amit", 65));
        list.add(new Student("Sneha", 45));
        list.add(new Student("Rohit", 32));
        list.add(new Student("Pooja", 88));
        list.add(new Student("Arjun", 55));
        list.add(new Student("Anjali", 91));
        list.add(new Student("Vikram", 28));
    }
}
