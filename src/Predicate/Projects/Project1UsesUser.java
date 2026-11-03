package Predicate.Projects;

import java.util.Scanner;
import java.util.function.Predicate;

public class Project1UsesUser {

    public static void main(String[] args) {

        // Predicate to validate username and password
        Predicate<User> p1 = user ->
                user.username != null &&
                        user.password != null &&
                        user.username.equalsIgnoreCase("Mubashshir") &&
                        user.password.equals("123");

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scn.nextLine().trim();

        System.out.print("Enter Password: ");
        String password = scn.nextLine().trim();

        // Creating User object
        User user1 = new User(username, password);

        // Testing Predicate
        if (p1.test(user1)) {
            System.out.println("Valid Credentials");
        } else {
            System.out.println("Invalid Credentials");
        }

        scn.close();
    }
}