public class Insertion_sort {
    public static void main(String [] args){
        /*Insertion sort - after comparing the elements to the left
        * shifts elements to the right to make room to insert a value.

        Runtime complexity O(n^2)
        Has less steps than bubble sort 
        It is like a jig-saw puzzle
        Best case is O(n) compared to selection sort O(n^2)
        
        */
        int array [] = {9,1,8,2,7,3,6,5,4};

        insertionSort(array);
        //for each loop
        for(int i : array){
            System.out.print(i + " ");
        }

    }
    private static void insertionSort(int [] array){
        for(int i = 0; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j+ 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
