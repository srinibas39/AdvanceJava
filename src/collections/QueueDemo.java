package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

    public static void show(){
       Queue<String> queue = new ArrayDeque<>();

//adding an element in teh queue
//       queue.add("c");
//       queue.add("a");
//       queue.add("b");
//       queue.offer("d");

//difference b/w add and offer is , if queue is of limited size then add gives error but offer gives false.

//        gives the top element

//        peek vs element => if queue is empty peek gives false where as element gives error
        String top=queue.peek();
        ///String anotherTop = queue.
        //System.out.println(top);

        String aTop = queue.element();
        //System.out.println(aTop);


        //remove the element from the queue

        // remove vs poll => remove gives errpr where as  poll gives false when queue is full

        String removedElement = queue.remove();
       // String polledElement = queue.poll();

        System.out.println(removedElement);
        //System.out.println(polledElement);



       //c -> a -> b

        System.out.println(queue);

    }
}
