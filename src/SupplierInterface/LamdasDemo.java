package SupplierInterface;

import java.util.List;
import java.util.function.Supplier;


public class LamdasDemo {
    public static void show(){
        Supplier<Double> getRandom = ()-> Math.random();

        var random = getRandom.get();
        System.out.println(random);
    }
}
