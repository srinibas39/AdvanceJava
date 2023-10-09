package LambdaExpressionAndFunctionalInterfaces;

import java.util.List;

public class LambdasDemo {

    public static void show(){

        //consumer interface
        List<Integer> list = List.of(1,2,3);
        //imperative way--> How to do
        //        for(var item : list){
        //            System.out.println(item);
        //        }

        //we can do the same thing using forEach
        //this forEach expects  a consumer interface , so we can give lambda expression
        //Declarative way -> what to do
        list.forEach(item -> System.out.println(item));

    }


}
