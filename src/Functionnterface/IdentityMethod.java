package Functionnterface;

import java.util.function.Function;

class IdentityMethod {
    public static void main(String[] args) {

        Function<String, String> f = Function.identity();

        System.out.println(f.apply("Java"));
        System.out.println(f.apply("Hello World"));
    }
}
