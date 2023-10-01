package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){

        //map is like object in javascript
        //or dictionary in python


        Map<String , Customer> map = new HashMap<>();

        //putting data inside the map
        map.put("cust1", new Customer("n1","e1"));
        map.put("cust2", new Customer("n2","e2"));
        map.put("cust3", new Customer("n3","e3"));

//        //getting value from map
//        var cust1= map.get("cust1");
//
//        //removing key from map
//        map.remove("cust2");
//
//        //replacing key value pair
//        map.replace("cust1",new Customer("c1+","e1+"));

        //iteraing over the map
        for(var item : map.entrySet()){
            System.out.println(item);
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }

        //iterating over the keys
        for(var key : map.keySet()){
            System.out.println(key);
        }

        //setting default value for invalid key
        var dCust=map.getOrDefault("c5",new Customer("cD","eD"));
        System.out.println(dCust);

        //check if key exist or not
        boolean check= map.containsKey("cust1");
        System.out.println(check);

        System.out.println(map);

    }
}
