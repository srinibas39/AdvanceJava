package generics;

public class GenericMethods {
    public static <T extends Comparable<T>> T max(T first , T second){
       //return (first > second) ? first : second;
        return (first.compareTo(second) > 0) ? first : second;
    }


    //multiple value parameter
    public static <K,V> void print(K key , V value){
        System.out.println(key + "="+ value);
    }

    public static void printUser(User user){
        System.out.println(user);
    }


    //here ? means
    // java will create a unknown class => class CAP#1 {}
    //class CAP#1 extends User{}

    public static void printUserList(GenericList<? super User> users){

//        //this is possible beacause the unknown CAP#1 class auto inherits the Object class
//        Object temp = users.get(0);
//        //but this is not possibel
       // User x = users.get(1);
        //but now new problem beacuse in users.add method we can pass only instance of CAP#1 method
        //To solve this problem we can use super keyword
        // so now we can pass instance of any class beacuse they all are directly or indriectly derivative
        // of Object class
        users.add(new User(10));

    }

}
