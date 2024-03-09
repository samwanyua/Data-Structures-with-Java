import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVarrayList {
    public static void main(String [] args){
        // Linkedlist vs ArrayList
        LinkedList<Integer> linked_list = new LinkedList<Integer>();
        ArrayList<Integer> array_list = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 10000000; i++){
            linked_list.add(i);
            array_list.add(i);
        }

        // linkedlist
        startTime = System.nanoTime();
        linked_list.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Linkedlist:\t" + elapsedTime + " ns");

        // arraylist

        startTime = System.nanoTime();
        array_list.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Arraylist:\t" + elapsedTime + " ns");
    }

    /*
     * Linkedlist took longer to access elements compared to arraylist cause' they can randomly access elements
     * Linkedlist is faster in removing and inserting elements
     */
}
