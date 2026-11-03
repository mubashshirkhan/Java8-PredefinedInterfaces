package Functionnterface.ChainingFunction;
import java.util.function.Function;

class FunctioChaining{

    public static void main(String[] args) {

        // First Function: Multiply by 2
        Function<Integer, Integer> f1 = n -> n * 2;

        // Second Function: Add 10
        Function<Integer, Integer> f2 = n -> n + 10;

        // andThen(): First f1 executes, then f2
        Function<Integer, Integer> andThenResult = f1.andThen(f2);

        // compose(): First f2 executes, then f1
        Function<Integer, Integer> composeResult = f1.compose(f2);

        int num = 5;

        System.out.println("Original Number: " + num);

        System.out.println("\nUsing andThen():");
        System.out.println("Result: " + andThenResult.apply(num));

        System.out.println("\nUsing compose():");
        System.out.println("Result: " + composeResult.apply(num));
    }
}