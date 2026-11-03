package BiInterfaces.Bifunction;

import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> f1 =
                (a, b) -> a + b;

        System.out.println(f1.apply(10, 20)); // 30
    }
}