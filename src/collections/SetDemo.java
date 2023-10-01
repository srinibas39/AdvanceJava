package collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetDemo {
    public static void show(){

        //set is undordersd unique collection of data
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        //removing duplicate elements from array

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","c","d");
        Set<String> listSet = new HashSet<>(list);
        System.out.println(listSet);

        //set operation
        Set<String> set1 = new HashSet<>(Arrays.asList("1","2","3","10"));
        Set<String> set2 = new HashSet<>(Arrays.asList("4","5","6","2","3"));

//        //union ==. all the elemnts in set1 and set2
//        set1.addAll(set2);
//        System.out.println("union"+set1);
//
        //intersection ==. retain all the elements of set 2 and delete remaining elements from set1
        set1.retainAll(set2);
        System.out.println("intersection"+set2);

        //difference ==> remove the elements of set2 from set 1
//        set1.removeAll(set2);
//        System.out.println("diff"+ set1);






    }
}
