package BiInterfaces.ProjectFunctionNDBiconsumer;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;

public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> l = new ArrayList<>();

        // BiFunction: Accepts two arguments and returns an Employee object.
        BiFunction<String, Double, Employee> f =
                (name, salary) -> new Employee(name, salary);

        l.add(f.apply("Durga", 1000.0));
        l.add(f.apply("Sunny", 2000.0));
        l.add(f.apply("Bunny", 3000.0));
        l.add(f.apply("Chinny", 4000.0));

        // BiConsumer: Accepts Employee and increment amount.
        // Increases employee salary by the given amount.
        BiConsumer<Employee, Double> c =
                (e, d) -> e.salary = e.salary + d;

        // Increment every employee's salary by 500.
        for (Employee e : l) {
            c.accept(e, 500.0);
        }

        // Display employee details.
        for (Employee e : l) {
            System.out.println("Employee Name: " + e.name);
            System.out.println("Employee Salary: " + e.salary);
            System.out.println();
        }
    }
}