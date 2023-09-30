package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

       public static void showList(){

           List<String> list = new ArrayList<>();
           //add elementsin the list
           list.add("a");
           list.add("b");
           list.add("c");

           //add element in the specific index
           list.add(1,"f");

           //remove element from specific index
           list.remove(1);

           //replace element from specific index
           list.set(1,"f");

           //get element from specific index
           String element=list.get(2);

           //add elements all at once
           Collections.addAll(list,"d","e","f");

           //sublist
           List<String> newList=list.subList(2,5);

           //indexOf
           int i=list.indexOf("e");

           //lastIndexOf
           int j= list.lastIndexOf("a");


           System.out.println(list);
           System.out.println(element);
           System.out.println(newList);
           System.out.println(i);
           System.out.println(j);

        }


}
