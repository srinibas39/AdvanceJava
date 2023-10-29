package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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

//        var movies = List.of(
//                new Movie("m1",10),
//                new Movie("m2",20),
//                new Movie("m3",30),
//                new Movie("m4",40)
//        );
//
//
//        //map
//        movies
//                .stream()
//                .map(movie -> "Movie Title "+movie.getTitle())
//                .forEach(title -> System.out.println(title));
//
//        //map Int
//        movies.stream()
//                .mapToInt(movie -> movie.getLikes())
//                .map(likes -> likes*10)
//                .forEach(System.out::println);

        //Flat maap
//        var stream = Stream.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
//        stream
//                .flatMap(list->list.stream())
//                .forEach(el-> System.out.println(el));


        //filter
//        var movies = List.of(
//                new Movie("movie1",10),
//                new Movie("movie2",20),
//                new Movie("movie3",30),
//                new Movie("movie3",40)
//        );
//
//        Predicate<Movie> isPopularMovies = movie->movie.getLikes()>10;
//
//        movies.stream()
//                .filter(isPopularMovies)
//                .forEach(movie-> System.out.println(movie.getTitle()));


        //slicing methods

//        var movies = List.of(
//                new Movie("movie1",10),
//                new Movie("movie2",20),
//                new Movie("movie3",30),
//                new Movie("movie4",40)
//        );
//
//        //limit
//
//        movies.stream()
//                .limit(2)
//                .forEach(movie -> System.out.println(movie.getTitle()));
//
//        System.out.println("-------------------------------------------------");
//
//        //skip
//        movies.stream()
//                .skip(2)
//                .forEach(movie -> System.out.println(movie.getTitle()));
//
//        //Pagination(IQ)
//        //suppose 1000
//        //1 page -> 10 movies
//        //page 3 -> 20 movies skip and 10 movies show
//        //genral formula; --> skip((page-1) * no of movies) in one page and limit(no of movies in one page)
//
//        //TakeWhilw
//        System.out.println("take while");
//        movies.stream()
//                .takeWhile(movie -> movie.getLikes()<= 20)
//                .forEach(movie -> System.out.println(movie.getTitle()));
//
//        //dropWhile
//        System.out.println("drop while");
//        movies.stream()
//                .dropWhile((movie -> movie.getLikes()<=20))
//                .forEach(movie -> System.out.println(movie.getTitle()));


        //Distinct method

//        var movies = List.of(
//                new Movie("m1",10),
//                new Movie("m2",20),
//                new Movie("m3",30),
//                new Movie("m4",40),
//                new Movie("m6",20)
//        );
//
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(System.out::println);

//        //peek methpd
//
//        var movies = List.of(
//                new Movie("m1",10),
//                new Movie("m2",20),
//                new Movie("m3",30),
//                new Movie("m4",40)
//        );
//
//        movies.stream()
//                .filter(movie -> movie.getLikes()>10)
//                .peek(movie -> System.out.println("filtered "+movie.getTitle()))
//                .map(movie -> movie.getTitle())
//                .peek(t -> System.out.println("mapped "+t))
//                .forEach(t -> System.out.println(t));


//reducer methods
//        var movies = List.of(
//              new Movie("m1",10),
//              new Movie("m2",20),
//              new Movie("m3",30),
//              new Movie("m4",40),
//              new Movie("m5",50)
//        );

//        var mCount =movies.stream()
//                .count();
//
//        System.out.println(mCount);

//        boolean res = movies.stream()
//                .anyMatch(m -> m.getLikes()>10);

//        boolean res = movies.stream()
//                        .allMatch(m -> m.getLikes()>10);

//        boolean res = movies.stream()
//                        .noneMatch(m ->m.getLikes()<10);
//
//        System.out.println(res);

        //findFirst

//        var firstMovie=movies.stream()
//                .findFirst();
//        System.out.println(firstMovie.get().getTitle());

//        FindAny =>will return any elements in the stream
//
//        var findMovie = movies.stream()
//                .findAny().get().getTitle();
//        System.out.println(findMovie);

        //max +. returns the max element of the stream
//        var maxElement = movies.stream()
//                .max(Comparator.comparing(Movie::getLikes));
//
//        System.out.println(maxElement.get().getTitle());
//
//        //min => returns the minimum element of the string
//        var minimumElement = movies.stream()
//                .min(Comparator.comparing(Movie::getLikes)).get().getTitle();
//
//        System.out.println(minimumElement);

        //Reduce--> general purpose reducer

//        var movies = List.of(
//                new Movie("m1",10),
//                new Movie("m2",20),
//                new Movie("m3",20),
//                new Movie("m4",40)
//        );
        //Suppose I want to get sum of all the likes
//        Optional<Integer> likesCount=movies.stream()
//                .map(m ->m.getLikes())
//                .reduce((a,c)->a+c);


        //System.out.println(likesCount.get());
        //but if reduce does not give any result then it will give error
        //so better use orElse
        //System.out.println(likesCount.orElse(0));

        // we can also refernce it
//        Optional<Integer> likesCount=movies.stream()
//                .map(m ->m.getLikes())
//                .reduce(Integer::sum);
//
//        System.out.println(likesCount);

        //We can also give inital value , which returns integer object
//                Integer likesCount=movies.stream()
//                .map(m ->m.getLikes())
//                .reduce(0,Integer::sum);
//
//        System.out.println(likesCount);

//     Collectors

var movies = List.of(
        new Movie("m1",10),
        new Movie("m2",20),
        new Movie("m3",30),
        new Movie("m4",40)
);

//collectors.toList()

//var result = movies.stream()
//        .filter(m -> m.getLikes()>10)
//        .map(m -> m.getTitle())
//        .collect(Collectors.toList());


//collectors.toSet()

//        var result = movies.stream()
//                .filter(m -> m.getLikes()>10)
//                .map(m -> m.getTitle())
//                .collect(Collectors.toSet());

//collectors.toMap
        var result = movies.stream()
                .filter(m -> m.getLikes()>10)
//                .collect(Collectors.toMap(m->m.getTitle(),m->m.getLikes()));
//                .collect(Collectors.toMap(m->m.getTitle(),m->m));
        .collect(Collectors.toMap(m->m.getTitle(), Function.identity()));


        System.out.println(result);


        //summinh -> int , long , double

        var result2 = movies.stream()
                .filter(m -> m.getLikes()>10)
                .collect(Collectors.summingInt(m ->m.getLikes())); // you can always use reference

        System.out.println(result2);

        //summmarzing
        var result3 = movies.stream()
                .filter(m ->m.getLikes()>10)
                .collect(Collectors.summarizingInt(Movie::getLikes));

        System.out.println(result3);

        //joining

        var joinedString = movies.stream()
                .filter(m->m.getLikes()>10)
                .map(m->m.getTitle())
                .collect(Collectors.joining("/"));

        System.out.println(joinedString);




















    }


}
