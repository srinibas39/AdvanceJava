package streams;

import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Movie1",10),
                new Movie("Movie2",20),
                new Movie("Movie3",3),
                new Movie("Movies3",30)
        );

        //Imperative programming
        int count = 0;

        for(var movie : movies){
            if(movie.getLikes()>10){
                count++;
            }
        }

        System.out.println("Imperative count "+count);


        //Functional Programming
        var count2 = movies.stream().filter(movie -> movie.getLikes()>10).count();
        System.out.println("Functional count "+count2);

    }


}
