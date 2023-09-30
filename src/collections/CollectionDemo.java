package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> list = new ArrayList<>();
        //adding element
        list.add("a");
        list.add("b");
        list.add("c");

        //checking element exist or not
        boolean res= list.contains("a");

        //add elemnts all at once
        Collections.addAll(list,"d","e","f");

        //remove element
//        list.remove("e");
//
//        //remove all elements
//        list.clear();
//
//        //coverting to regular Array
//        Object newArray[]=list.toArray();

        //converting toregular array in string format
        String strArr[] =  list.toArray(new String[0]);

        for(String ele : strArr){
            System.out.println(ele.toUpperCase());
        }

        //adding collection into a collection
        Collection<String> other = new ArrayList<>();
        other.addAll(list);
        System.out.println(other == list); // checking reference
        System.out.println(other.equals(list)); //checks actual value

        System.out.println(list);
        System.out.println(res);
        //System.out.println(newArray);
        System.out.println(strArr);
    }
}
