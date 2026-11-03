package Predicate;

import java.util.function.Predicate;

public class PredicatesTest3 {

    public static void main(String[] args) {

        String[] names = {"Rahul", "Sohel","Krunal","kishan", "Malika", "Kartik"};

        Predicate<String> p1 = s -> Character.toLowerCase(s.charAt(0)) == 'k';

        System.out.println("Names starting with letter K are:");

        for(String s:names){//traversing over array
            if(p1.test(s)){
                System.out.println("Direct: "+s);
            }
        }

        m1(p1, names);
    }

    public static void m1(Predicate<String> p, String[] s) {

        for (String s1 : s) {
            if (p.test(s1)) {
                System.out.println("Using another meth:"+s1);
            }
        }
    }
}