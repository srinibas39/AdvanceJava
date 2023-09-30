package generics;


import java.util.Iterator;

public class GenericList<T> implements Iterable {

    private T list[] = (T[])new Object[10];
    private int count;

    public void add(T element){
        this.list[this.count++]=element;
    }

    public T get(int index){
        return this.list[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    //basically i want to iterate over our Generic list

    private class ListIterator implements Iterator<T> {

        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;

        }

        @Override
        public boolean hasNext() {
            return (this.index < this.list.count);
        }

        @Override
        public T next() {
            return this.list.list[this.index++];
        }
    }
}
