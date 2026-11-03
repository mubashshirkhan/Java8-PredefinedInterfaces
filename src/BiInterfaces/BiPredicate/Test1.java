package BiInterfaces.BiPredicate;

import java.util.function.BiPredicate;

public class Test1 {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> p1 =
                (a, b) -> a > b;

        System.out.println(p1.test(20, 10)); // true
        System.out.println(p1.test(10, 20)); // false
    }
}