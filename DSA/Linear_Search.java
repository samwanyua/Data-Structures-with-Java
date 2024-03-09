public class Linear_Search {
    public static void main(String [] args){
        // Linear search
        /*
         * Here we iterate through a collection one element at a time
         * Runtime complexity: O(n)
         * 
         * Dis.
         * Slow for large data sets
         * 
         * Adv:
         * Fast for searches of small to medium data sets
         * Doesn't need to be sorted
         * Useful for Data structures that do not have random access(Linked list for example)
         * 
         */

         int[] array = {9,1,8,2,7,3,6,4,5};

         int index = LinearSearch(array, 4);

         if(index != -1){
            System.out.println("Element found at index: " + index);
         }
         else{
            System.out.println("Element not found!");
         }

    }
    private static int LinearSearch(int[] array, int value){
        for(int i =0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
