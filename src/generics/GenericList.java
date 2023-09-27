package generics;

public class GenericList<T extends Comparable & Cloneable> {

    private T list[] = (T[])new Object[10];
    private int count;

    public void add(T element){
        this.list[this.count++]=element;
    }

    public T get(int index){
        return this.list[index];
    }
}
