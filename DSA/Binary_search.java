import java.util.Arrays;

public class Binary_search {
    public static void main(String [] args){
        // Binary search
        /*
         * Search algorithm that finds the position of a target value
         * within a sorted array.
         * Half of the array is eliminated during each step
         * Not efficient with small data sets
         * It is very efficient with large data sets
         * Runtime complexity -> O(log n)
         * 
         */

         int array[] = new int[100];
         int target = 1;

         for(int i = 0; i < array.length; i++){
            array[i] = i;
         }

        //  int index = Arrays.binarySearch(array, target);

        //creating a binarysearch
         int index = binarySearch(array, target);
         if(index == -1){
            System.out.println(target + "Element not found");
         }
         else{
            System.out.println("Element found at: " + index);
         }
    }

    private static int binarySearch(int [] array, int target){
        int low = 0; 
        int high = array.length - 1;

        while(low <= high){
            int middle = low + (high - low)/2;
            int value = array[middle];

            System.out.println("Middle: " + value);

            if(value < target){
                low = middle + 1;
            }
            else if(value > target){
                high = middle -1;
            }
            else{
                return middle;
            }

            

        }
        return -1;
    }
}
