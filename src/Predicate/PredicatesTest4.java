package Predicate;

import java.util.function.Predicate;

public class PredicatesTest4 {
    public static void main(String[] args) {

        String[] names =
                {"Rahul", "", null, "Krunal", "kishan", "Malika", "Kartik"};

        Predicate<String> p1 = s -> s == null || s.isEmpty();

        for (int i = 0; i < names.length; i++) {

            if (p1.test(names[i])) {
                System.out.println("Index: " + i);
                System.out.println("Element: " + names[i]);
            }
        }
    }
}