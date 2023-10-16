package LambdaExpressionAndFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasDemo {

    public static void show(){

        //consumer interface
//        List<Integer> list = List.of(1,2,3);
//        //imperative way--> How to do
//        //        for(var item : list){
//        //            System.out.println(item);
//        //        }
//
//        //we can do the same thing using forEach
//        //this forEach expects  a consumer interface , so we can give lambda expression
//        //Declarative way -> what to do
//        list.forEach(item -> System.out.println(item));

        //chaning consumers

//        List<String> list = List.of("apple", "banana", "cherry");
//
//        Consumer<String> print = item -> System.out.println(item);
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//
//        list.forEach(print.andThen(printUpperCase).andThen(print));


        //supplier interface

//        Supplier<Double> getRandom = ()-> Math.random()+1;
//        // This is called as lazy evaluation.That means instead of function
//        // getting called immediately we can call this function at some later time.
//        var random = getRandom.get();
//        System.out.println(random);
//
//        //Supper has own primitve  specialization
//        // to avoid uneesaary boxing and unboxing.


        //Functional Interface
//        List<String> list = List.of("Mango","Apple","Cherry");
//
//        Function<String,Integer> lengthOfString = item -> item.length();
//
//        list.forEach(item -> System.out.println(lengthOfString.apply(item)));

        //It has three category of primtive types variations.

        //compose functions
        //convert "Key:value" --> {key = value}
        //so forst we will replace colon  with equals to
        // then we will dd braces

//        Function<String,String> removeColonWithEquals = str ->
//                str.replace(":","=");
//
//        Function<String, String> addBraces = str -> '{' + str + '}';
//
//        var result = removeColonWithEquals.andThen(addBraces).apply("Key:value");
//        System.out.println(result);
//        //we achieve same thing using compose
//
//        var composeResult=addBraces.compose(removeColonWithEquals).apply("Key:value");
//        System.out.println(composeResult);

        //compose does same thing as addThen but in reverse.

        //Predicate --> to test a condition
//        Predicate<String> isStrLengthGtThan5= str -> str.length() > 5;
//        var result = isStrLengthGtThan5.test("Oranges");
//        System.out.println(result);

        //combining the predicates

        Predicate<String> hasLeftBreaces = str -> str.startsWith("{");
        Predicate<String> hasRightBraces = str -> str.endsWith("}");

       Predicate<String> leftAndRight = hasLeftBreaces.and(hasRightBraces);


        Predicate<String> leftOrRight = hasLeftBreaces.or(hasLeftBreaces);


        var res=leftOrRight.test("{Key:value}");
        var res2=leftOrRight.test("Key:value");

        System.out.println(res);
        System.out.println(res2);



    }


}
