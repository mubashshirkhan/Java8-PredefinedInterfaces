package Predicate.EmployeeMangement;

public class Employee {
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String toString() {
        String s = String.format(("%s , %s, %.2f, %s")
                , name, designation, salary, city);
        return s;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (name.equalsIgnoreCase(e.name) && designation.equalsIgnoreCase(e.designation)
                && salary == 30000 && city.equalsIgnoreCase(e.city)) {
            return true;
        } else {
            return false;
        }
    }
}
