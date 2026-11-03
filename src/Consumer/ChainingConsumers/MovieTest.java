package Consumer.ChainingConsumers;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieTest {

    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<>();

        populate(list);

        Consumer<Movie> c1 = movie -> System.out.println(movie.name + " is ready to release");
        Consumer<Movie> c2 = movie -> System.out.println(movie.name + " is a " + movie.result);
        Consumer<Movie> c3 = movie -> System.out.println(movie.name + " is storing in db");
        Consumer<Movie> ChainedConsumer = c1.andThen(c2).andThen(c3);

        Movie m = new Movie("3 idiots", "flop");
        ChainedConsumer.accept(m);
    }

    public static void populate(ArrayList<Movie> list) {

        list.add(new Movie("Baahubali", "Blockbuster"));
        list.add(new Movie("RRR", "Blockbuster"));
        list.add(new Movie("Pushpa", "Super Hit"));
        list.add(new Movie("Jersey", "Hit"));
        list.add(new Movie("Devara", "Average"));
        list.add(new Movie("Salaar", "Super Hit"));
        list.add(new Movie("Arjun Reddy", "Blockbuster"));
        list.add(new Movie("Geetha Govindam", "Super Hit"));
        list.add(new Movie("Sita Ramam", "Super Hit"));
        list.add(new Movie("Magadheera", "Blockbuster"));
    }
}