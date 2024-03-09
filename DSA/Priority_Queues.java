import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queues {
    public static void main(String [] args){
        /*
         * PRIORITY QUEUES
         * It's  a FIFO data structure that serve elements with
         * highest priorities first before elements with lower priority
         */

         /*Queue<Double> queue = new LinkedList<>();

         queue.offer(3.4);
         queue.offer(2.5);
         queue.offer(4.0);
         queue.offer(4.2);
         queue.offer(3.2);

        //  To display all the elements in the queue
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }*/


         Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

         queue.offer(3.4);
         queue.offer(2.5);
         queue.offer(4.0);
         queue.offer(4.2);
         queue.offer(3.2);

        //  To display all the elements in the queue
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }


         Queue<String> queues = new PriorityQueue<>(); // If you want a reverse order -> Collections.reverseOrder()

         queues.offer("A");
         queues.offer("D");
         queues.offer("E");
         queues.offer("B");
         queues.offer("F");

        //  To display all the elements in the queues
        while(!queues.isEmpty()){
            System.out.println(queues.poll());
        }

        /

    }
}
