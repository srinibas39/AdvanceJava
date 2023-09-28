package generics;

public class GenericMethods {
    public static <T extends Comparable<T>> T max(T first , T second){
       //return (first > second) ? first : second;
        return (first.compareTo(second) > 0) ? first : second;
    }
}
