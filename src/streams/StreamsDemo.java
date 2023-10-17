package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
//        List<Movie> movies = List.of(
//                new Movie("Movie1",10),
//                new Movie("Movie2",20),
//                new Movie("Movie3",3),
//                new Movie("Movies3",30)
//        );
//
//        //Imperative programming
//        int count = 0;
//
//        for(var movie : movies){
//            if(movie.getLikes()>10){
//                count++;
//            }
//        }
//
//        System.out.println("Imperative count "+count);
//
//
//        //Functional Programming
//        var count2 = movies.stream().filter(movie -> movie.getLikes()>10).count();
//        System.out.println("Functional count "+count2);

        //creating a stream
        //anything that implements collection interfce can have stream
        //Arrays cannot have stream in itself but we can pass it to Arrays.strema
        //toconvert it to stream

//        int numbers[]={1,2,3};
//        Arrays.stream(numbers).forEach(n -> System.out.println("Hello "+n));
//
//        //can enter anything into the string
//        var stream= Stream.of(1,2,"Hello");
//
//        stream.forEach(item -> System.out.println(item));

        //we can geneate infinte values in stream beacuse it does not
        // generate valuess beforehand
        //like collections in which you will get out of mempry
        //it calls the generate wehen you call it , this is called as lazy evaluation

        // in strean , we basically do three things
        //generate the srteam
        //do data transformations
        //terminate

//        var stream = Stream.generate(()->Math.random());
//        stream
//                .limit(5)
//                .forEach(n -> System.out.println(n))//lazy evalutaion

//        Stream.iterate(1, n -> n + 1)
//                .limit(5)
//                .forEach(System.out::println);

        //map

        var movies = List.of(
                new Movie("m1",10),
                new Movie("m2",20),
                new Movie("m3",30),
                new Movie("m4",40)
        );


        //map
        movies
                .stream()
                .map(movie -> "Movie Title "+movie.getTitle())
                .forEach(title -> System.out.println(title));

        //map Int
        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .map(likes -> likes*10)
                .forEach(System.out::println);

        //Flat maap
        var stream = Stream.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
        stream
                .flatMap(list->list.stream())
                .forEach(el-> System.out.println(el));







    }


}
