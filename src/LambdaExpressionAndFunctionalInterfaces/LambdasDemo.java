package LambdaExpressionAndFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

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

        List<String> list = List.of("apple", "banana", "cherry");

        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        list.forEach(print.andThen(printUpperCase).andThen(print));



    }


}
