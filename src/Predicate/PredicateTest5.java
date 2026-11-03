package Predicate;

import java.util.function.Predicate;

public class PredicateTest5 {
    public static void main(String[] args) {
        Predicate<String> p=Predicate.isEqual("Mubashshir");
        System.out.println(p.test("Mubashshir"));
        System.out.println(p.test("Sohel"));
    }
}
