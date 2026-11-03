package SupplierInterface;

import java.util.Date;
import java.util.function.Supplier;
import static java.lang.Math.*;

public class SupplierTest1 {

    public static void main(String[] args) {
        Supplier<Date> s1= () -> new Date();
        System.out.println(s1.get());

        Supplier<Double> d1 = ()-> random();
        System.out.println(d1.get());

        Supplier<String> s2 = ()->{
          String [] s = {"sunny","bunny","chiiny","munny"};

            int x = (int) (Math.random() * 4);//0 to3

            return s[x];
        };
        System.out.println(s2.get());
    }
}
