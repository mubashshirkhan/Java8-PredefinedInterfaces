package Predicate;

import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25};

        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("Greater than 10 are");
        m1(p1,x);
        System.out.println("Evens are");
        m1(p2,x);
        System.out.println("Not Greater than 10 are");
        m1(p1.negate(),x);
        System.out.println("Greater than 10 and even are");
        m1(p1.and(p2), x);
        System.out.println("Greater than 10 and even are");
        m1(p1.or(p2), x);
    }

    public static void m1(Predicate<Integer> P, int[] x) {
        for (int x1 : x) {
            if (P.test(x1))
                System.out.println(x1);

        }
    }
}
