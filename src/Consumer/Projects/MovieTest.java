package Consumer.Projects;

import java.util.ArrayList;
import java.util.function.Consumer;


public class MovieTest {
    public static void main(String[] args) {

        ArrayList<Movie> movie = new ArrayList<>();
        populate(movie);

        Consumer<Movie> m1 = mv -> {
            System.out.println("Movie: "+mv.name);
            System.out.println("Hero: "+mv.hero);
            System.out.println("Heroiene: "+mv.heroiene);
        };

        for (Movie m: movie){
            m1.accept(m);
            System.out.println();
        }
    }

    public static void populate(ArrayList<Movie> movie) {

        movie.add(new Movie("Baahubali", "Prabhas", "Anushka Shetty"));
        movie.add(new Movie("RRR", "Ram Charan", "Alia Bhatt"));
        movie.add(new Movie("Pushpa", "Allu Arjun", "Rashmika Mandanna"));
        movie.add(new Movie("Jersey", "Nani", "Shraddha Srinath"));
        movie.add(new Movie("Devara", "Jr NTR", "Janhvi Kapoor"));
        movie.add(new Movie("Salaar", "Prabhas", "Shruti Haasan"));
        movie.add(new Movie("Arjun Reddy", "Vijay Deverakonda", "Shalini Pandey"));
        movie.add(new Movie("Geetha Govindam", "Vijay Deverakonda", "Rashmika Mandanna"));
        movie.add(new Movie("Sita Ramam", "Dulquer Salmaan", "Mrunal Thakur"));
        movie.add(new Movie("Magadheera", "Ram Charan", "Kajal Aggarwal"));
        movie.add(new Movie("Bharat Ane Nenu", "Mahesh Babu", "Kiara Advani"));
        movie.add(new Movie("Eega", "Nani", "Samantha"));
        movie.add(new Movie("Ala Vaikunthapurramuloo", "Allu Arjun", "Pooja Hegde"));
        movie.add(new Movie("Pokiri", "Mahesh Babu", "Ileana"));
        movie.add(new Movie("Temper", "Jr NTR", "Kajal Aggarwal"));
    }
}
