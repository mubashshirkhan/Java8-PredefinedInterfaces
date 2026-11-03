package Functionnterface;


import java.util.function.Function;

public class FunctionIntefaceTest1 {
    public static void show() {

        Function<String,Integer> Length = str -> str.length();
        var name1 = Length.apply("MubashshirKhanAzamKhan");
        System.out.println(name1);
        System.out.println();

        Function<Integer,Integer> square;
        square = num -> (num*num);

        var sqr1= square.apply(2);
        System.out.println(sqr1);

        Function<String,String> rmspace = str->str.replaceAll(" ","");
        var product1 = rmspace.apply("Lens ka rt");
        System.out.println(product1);



        Function<String,Integer> withspace = str -> str.length() - str.replaceAll(" ","").length();
        var remspace = withspace.apply("Mu ba s hshir");
        System.out.println();
        System.out.printf("the String contains %d spaces",remspace);
    }
}
