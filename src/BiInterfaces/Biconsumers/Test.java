package BiInterfaces.Biconsumers;

import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {

        BiConsumer<String, Integer> c1 =
                (name, age) ->
                        System.out.println(name + " " + age);

        c1.accept("Rahul", 25);
    }
}