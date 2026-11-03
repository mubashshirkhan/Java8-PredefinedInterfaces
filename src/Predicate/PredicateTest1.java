package Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest1 {
    public static void main(String[] args) {
        Predicate<String> P = S-> S.length()>5;

        System.out.println(P.test("abcdef"));//true
        System.out.println(P.test("abc"));//false

        Predicate<Collection> p = c -> c.isEmpty();
        ArrayList i1  = new ArrayList();
        i1.add("A");
        System.out.println(p.test(i1));//false

        ArrayList i2 = new ArrayList();
        System.out.println(p.test(i2));//true
    }
}
