import java.util.ArrayList;



public class Dynamic_array {
    public static void main(String [] args){
        // Dymanic arrays/ArrayLists - array with resizable capacity
        /*C++ -> Vector, JS - Array, Python -> list
         * Growth factor is *2
         * Adv:
         * Random access of elements O(1)
         * Good locality of reference and data cache utilization
         * Easy to insert and delete at the end
         * 
         * Dis:
         * Wasted memory
         * Shifting elements is time consuming
         * Expanding and shrinking array is time consuming O(n)
         * 
         * Static array - has fixed capacity
         * Easy to access a random element(O(1))
         * Searching takes time O(n)
         * Dis: have a fixed capacity
         * 
         */

         ArrayList<String> array_list = new ArrayList<String>();

         DynamicArray dynamicArray = new DynamicArray(8);

         System.out.println(dynamicArray.capacity);





    }
}
