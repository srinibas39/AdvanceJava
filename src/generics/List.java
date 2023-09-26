package generics;

public class List {
     private int list[] = new int[10];
     private int count;


     public void add(int element){
         this.list[this.count++]=element;
     }

     public  int get(int idx){
         return this.list[idx];
     }





}
