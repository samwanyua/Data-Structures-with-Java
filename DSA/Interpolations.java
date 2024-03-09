public class Interpolations {
    public static void main(String [] args){
        //Interpolation search
        /*
         * They are improvement over binary search
         * Best used for 'uniformly' distributed data
         * 'Guesses' where a value might be based on calculated probe results
         * If probe is incorrect, search area is narrowed and try again
         * 
         * Average case is: O(log(log(n)))
         * Worst case: O(n) [values increase exponentially]
         */

        int [] array = {1,2,3,4,5,6,7,8,9};

        int index = interpolationSearch(array, 8);


        if(index != -1){
            System.out.println("Elemenet found at index: " + index);
        }
        else{
            System.out.println("Element not found!");
        }
        
    }
    private static int interpolationSearch(int [] array, int value){
        int high = array.length - 1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high ){
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("Probe: " + probe);

            if(array[probe] == value)
                return probe;
            else if(array[probe] < value){
                low = probe + 1;
            }
            else{
                high = probe -1;
            }
        }
        return -1;
    }
}
