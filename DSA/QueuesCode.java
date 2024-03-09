import java.util.Queue;
import java.util.LinkedList;

public class QueuesCode {
    public static void main(String [] args){
        /*
         * QUEUES -FIFO (First In First Out)
         * ex. A line of people
         * It's a linear data structure
         * A collection designed for holding elements prior to processing
         * 
         * add = enqueue, offer() //add to the tail
         * remove = dequeue, poll() //remove from the head of our queue
         * peek()
         * 
         */


         Queue<String> queue = new LinkedList<String>();

         //to enqueue
         queue.offer("Caren");
         queue.offer("Steve");
         queue.offer("Catr");
         queue.offer("GLen");

         //to show all elements
         System.out.println(queue);

        //  to check the head
        System.out.println(queue.peek());

        // to dequeue
        System.out.println(queue.poll());
        System.out.println(queue);

        // to check if queue is empty
        System.out.println(queue.isEmpty());

        // size of our queue
        System.out.println(queue.size());

        // contains method
        System.out.println(queue.contains("GLen"));
    /*
     * USES
     * Keyboard buffers(Letters should appear on the screen in the order they're pressed)
     * Printer queue
     * Used in LinkedLists, priority queues, breadth-first search
     */
            
         
    }
}
