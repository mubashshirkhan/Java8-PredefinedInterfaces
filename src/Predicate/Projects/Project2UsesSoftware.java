package Predicate.Projects;

import java.util.Scanner;
import java.util.function.Predicate;

public class Project2UsesSoftware {
    public static void main(String[] args) {


        SoftwareEngineer[] list = {
                new SoftwareEngineer("Mubashshir", 23, false),
                new SoftwareEngineer("Sohel", 23, true),
                new SoftwareEngineer("Danish", 22, true),
                new SoftwareEngineer("Sanawar", 22, true),
        };

        Predicate<SoftwareEngineer> allowed = se ->
                se.age >= 18 &&
                        se.isHaving == false;

        for (SoftwareEngineer se : list) {
            if (allowed.test(se)) {
                System.out.println(se.name + " is a Software Engineer");
            } else {
                System.out.println(se.name + " is not a Software Engineer");

            }
        }
    }
}
