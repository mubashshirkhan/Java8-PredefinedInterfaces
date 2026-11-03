package ConsumerConsumerInterface;

import java.util.List;

public class LamdasDemo {
    public static void show(){
        List<Integer> list =List.of(1,2,3);

        for(var item: list)
            System.out.println(item);

        list.forEach(item-> System.out.println(item));
    }
}
