public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    // constructor
    public DynamicArray(){
        this.array = new Object[capacity];
    }
    // overloaded constructor
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // Dynamic arrays methods
    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size ++;
    }

    public void insert(int index, Object data){

    }

    public void delete(Object data){

    }

    public int search(){
        return -1;
    }

    public void grow(){

    }

    public void shrink(){

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        
        return null;
    }

}