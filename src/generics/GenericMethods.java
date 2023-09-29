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

    public static void printUserList(GenericList<User> users){
        System.out.println(users);
    }

}
