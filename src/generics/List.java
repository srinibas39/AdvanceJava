package generics;

public class List {
     private Object list[] = new Object[10];
     private int count;


     public void add(Object element){
         this.list[this.count++]=element;
     }

     public  Object get(int idx){
         return this.list[idx];
     }





}
