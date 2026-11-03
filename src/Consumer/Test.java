package Consumer;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> s1 = c -> System.out.println(c);
        s1.accept("Mubashshir");
        s1.accept("Sohel");

    }
}
