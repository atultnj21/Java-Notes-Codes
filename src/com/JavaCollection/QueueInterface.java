/* We need Queue where we need to process jobs
   based on the order we receive them.

   ArrayDeque -> double ended queue special type of queue
   having two ends.
   PriorityQueue -> a special type of queue where each
   item gets a priority this priority determines the position
   of each element in the queue. */

package com.JavaCollection;

import java.util.ArrayDeque;
import java.util.Queue;

class QueueDemo{
    public static void show(){
        Queue<String> queue= new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        //d -> b -> a -> c

        // add method throws exception offer method returns false
        //offer
        queue.offer("d");
        System.out.println(queue);

        //peek
        var front = queue.peek();
        System.out.println(front);//c

        System.out.println(queue.element());//c
        //peek returns null element shows exception

        //removes -> removes the item at the front and return it
        //similar to poll difference is poll returns null removes throw exception
        var removed = queue.remove();
        System.out.println(removed);//c
    }
}
public class QueueInterface {
    public static void main(String[] args) {
        QueueDemo.show();
    }
}
