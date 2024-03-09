import java.util.LinkedList;

public class Linked_list {
    public static void main(String [] args){
        // Linked Lists(singly)
        /*
         * Arrays and arraylists have difficulty in inserting and deleting
         * Arrays:
            Fixed size: You need to specify the size when creating an array, and it cannot be changed.
            Supports both primitive data types and objects.
            Accessed using an index, starting from 0.
            Once created, the size is immutable; to add or remove elements, a new array must be created.
            
            // Declaration and initialization of an array of integers
            int[] integerArray = new int[5];
            // Initialization with values
            int[] arrayWithValues = {1, 2, 3, 4, 5};
            int firstElement = arrayWithValues[0];  // Accessing the first element


        ArrayLists:
            Dynamic size: Can grow or shrink dynamically.
            Can only store objects, not primitive data types (unless using wrapper classes).
            Accessed using methods like get(index).
            Supports dynamic resizing; elements can be added or removed easily.

            // Declaration and initialization of an ArrayList of integers
            ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
            // Initialization with values
            ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("One", "Two", "Three"));

            String secondElement = stringArrayList.get(1);  // Accessing the second element

         */
        /*
         * Linkedlists - don't have an index
         * Have nodes that has data to be stored and a pointer(address) of the next node in line
         * Nodes are non-contiguous
         * At the tail - pointer has a value of null
         * Inserting a node, there's no shifting of elements, wherever we need to place
         * a new node, we take the address stored in the previous node and assign the address
         * of our new node with the address from the previous node so that our new node is pointing to
         * our next node.
         * 
         * Deleting a node - our previous node is assigned to the next node in line
         * No shifting of elements
         * 
         * They are bad at searching
         * 
         * DOUBLY LINKED LIST
         * stores two memory addresses(one for the previous and the other one for the next node)
         * Advantage -> we can tranverse our doubly linkedlist from head to tail or tail to head
         * Uses more memory than single linkedlist
         */

        LinkedList<String> linked_list = new LinkedList<String>();

        /*// linkedlist as a stack
        linked_list.push("A");
        linked_list.push("B");
        linked_list.push("C");
        linked_list.push("D");
        linked_list.push("E");
        linked_list.push("F");

        // We can pop
        linked_list.pop();

        System.out.println(linked_list); //LIFO*/

        // Linkedlist as a queue
        linked_list.offer("A");
        linked_list.offer("B");
        linked_list.offer("C");
        linked_list.offer("D");
        linked_list.offer("F");

        // TO remove
        // linked_list.poll();

        System.out.println(linked_list); //FIFO

        /*
         * Linkedlist is good at insertion and deletion of nodes
         */

        //  Inserting between D snd F
        linked_list.add(4,"E"); //4 is index
        System.out.println(linked_list);

        // to remove a node
        linked_list.remove("E");
        System.out.println(linked_list);

        // Searching for an item
        System.out.println(linked_list.indexOf("F"));


        // More linkedlists methods
        System.out.println(linked_list.peekFirst()); // the first node
        System.out.println(linked_list.peekLast()); // the last node

        // adding new nodes first and last
        linked_list.addFirst("0");
        linked_list.addLast("G");

        // removing first and last node
        linked_list.removeFirst();
        linked_list.removeLast();


        System.out.println(linked_list);

        /*
         * Linked list = stores nodes in 2 parts (data + address)
         * Nodes are in non-consecutive memory locations
         * Elements are linked to pointers
         * 
         * ex. of a single linkedlist
         * 
         *       node                  node                node
         * [data | address]    ->  [data | address]   ->   [data | address]
         * 
         *                  double linkedlist
         *       node                  node                node
         * [data | address]    <->  [data | address]   <->   [data | address]
         * 
         * Adv
         * Dynamic data structure (allocate needed memory while running)
         * Insertion and deletion of nodes is easy
         * No/low memory wastage
         * 
         * Dis
         * Great memory wastage
         * No random access of element
         * Accessing/searching elements is more time consuming
         * 
         * Uses
         * Implement Stack/queues
         * Gps navigation
         * music playlist
         */

        



    }
}
