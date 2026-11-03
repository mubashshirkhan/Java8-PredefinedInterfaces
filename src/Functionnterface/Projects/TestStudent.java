package Functionnterface.Projects;

import java.util.ArrayList;
import java.util.function.Function;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        populate(l);

        Function<Student, String> f = s -> {
            int marks = s.marks;
            if (marks >= 100) {
                return "A[Distinction]";
            } else if (marks >= 60) {
                return "B[First class]";
            } else if (marks >= 50) {
                return "C[Second class]";
            } else if (marks >= 30) {
                return "D[Third class]";
            } else {
                return "Failed";
            }
        };
        for (Student s: l) {
            System.out.println("Student "+s.name);
            System.out.println("Marks: "+s.marks);
            System.out.println("Student grade"+f.apply(s));
            System.out.println();
        }

        }
        public static void populate (ArrayList < Student > l) {
            l.add(new Student("Sunny", 100));
            l.add(new Student("Bunny", 65));
            l.add(new Student("Cunny", 55));
            l.add(new Student("David", 90));
            l.add(new Student("David", 25));
    }
}