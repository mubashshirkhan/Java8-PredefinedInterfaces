package Predicate.EmployeeMangement;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestUsesEmployee {


    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();
        populate(list);
        Predicate<Employee> p1 = emp -> emp.designation.equalsIgnoreCase("JavaDev");
        Predicate<Employee> p2 = emp -> emp.salary > 200000;
        Predicate<Employee> p3 = emp -> emp.city.equalsIgnoreCase("Hyd");

        System.out.println("Java devs-> ");
        display(p1, list);

        System.out.println();
        System.out.println("Salary greater than 200000-> ");
        display(p2, list);

        System.out.println();
        System.out.println("Java devs at Hyd-> ");
        display(p3.and(p1), list);//predicate joining


        System.out.println();
        System.out.println("employees not java devs-> ");
        display(p1.negate(), list);//predicate joining


        Predicate<Employee> isCeo =Predicate.isEqual(new Employee("Mubashshir","Ceo",30000,"Hyd"));
        //isEqual predicate predefined static method

        Employee e1= new Employee("Mubashshir","Ceo",30000,"Hyd");
        Employee e2= new Employee("Tausif","Pythondev",30000,"Hyd");
        System.out.println();
        System.out.println("employees who are ceo's-> ");
        System.out.println(isCeo.test(e1));
        System.out.println(isCeo.test(e2));
    }

    public static void populate(ArrayList<Employee> list) {

        list.add(new Employee("Mubashshir", "JavaDev", 300000, "Hyd"));
        list.add(new Employee("Sohel", "Data Scientist", 300000, "Hyd"));
        list.add(new Employee("Danish", "Data Scientist", 300000, "Kondhali"));
        list.add(new Employee("Sanawar", "Data Analyst", 200000, "Arvi"));
        list.add(new Employee("Rahul", "JavaDev", 450000, "Hyd"));
        list.add(new Employee("Krunal", "ceo", 500000, "Mumbai"));
        list.add(new Employee("Kartik", "Frontend Developer", 350000, "Pune"));
        list.add(new Employee("Malika", "Data Analyst", 400000, "Nagpur"));
        list.add(new Employee("Ayesha", "Software Tester", 300000, "Hyd"));
        list.add(new Employee("Arman", "Backend Developer", 550000, "Bangalore"));
        list.add(new Employee("Priya", "Data Scientist", 650000, "Pune"));
        list.add(new Employee("Rohit", "DevOps Engineer", 700000, "Mumbai"));
        list.add(new Employee("Sahil", "JavaDev", 400000, "Arvi"));
        list.add(new Employee("Neha", "Ceo", 350000, "Nagpur"));
    }

    public static void display(Predicate<Employee> p, ArrayList<Employee> emp) {

        for (Employee employee : emp) {
            if (p.test(employee)) {
                System.out.println(employee);
            }
        }
    }
}

