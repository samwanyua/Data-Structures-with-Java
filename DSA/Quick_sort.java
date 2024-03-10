public class Quick_sort {
    /*
     * Quick sort - moves smaller elements to the left of a pivot
     * Recursively divide array in 2 partitions
     * 
     * Runtime complexity = Best case O(n log(n))
     *                      Average case O(n log(n))
     *                      Worst case O(n^2)
     * Space coplexity = O(log(n)) due to recursion
     * 
     */
    public static void main(String[] args) {
        int[] array = {8,2,5,3,9,4,7,6,1};

        quicksort(array, 0, array.length -1);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    private static void quicksort(int[] array, int start, int end) {
        if(end <= start) return; //base case
        int pivot = partition(array, start, end);

        quicksort(array, start, pivot -1);
        quicksort(array, pivot + 1, end);
        
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        
        for(int j = start; j <= end - 1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        
        return i;


        
    }
}

