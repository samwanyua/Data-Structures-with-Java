public class Bubble_sort {
    public static void main(String [] args){
        // Bubble sort
        /*
         * It's like the concept of floating and sinking
         * Works with pairs
         * It is not efficient even with small data sets
         * Runtime complexity = O(n^2) same as insertion sort, selection sort
         * Pairs of adjacent elements are compared and the elements are swapped if they
         * are not in order
         * 
         */
        int array[] = {9,1,8,2,7,3,6,4,5};
        
        bubbleSort(array);

        for(int i : array){
            System.out.print(i);
        }

    }

    public static void bubbleSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i -1; j++){
                if(array[j] > array[j + 1]){ // for descending order >> if(array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
