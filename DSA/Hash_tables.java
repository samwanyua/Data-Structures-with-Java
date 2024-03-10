import java.util.Hashtable;

public class Hash_tables {
    /*
     * Hash tables - collection of key value pairs
     * Is a data structure that stores unique keys to values ex. <Integer, String>
     *      Each key/value pair is known as an entry
     *      Fast insertion, look up, deletion of key/value pairs
     *      Nor ideal for small data sets, great with large data sets
     * Hashing - takes a key and computes an integer
     *          we use hash % capacity to calculate an index number
     *          key.hashcode() % capacity = index
     * Bucket - an indexed storage location for one or more entries
     *        - can store multiple entries in case of a collission(linked similarly a linked list)
     * Collision - hash function generates the same index for more than one key
     *          less collisions = more efficiency
     * 
     * Runtime complexity: Best case O(1)
     *                     Worst case O(n)
     * 
     */
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>(10); //10 is the capacity

        // add elements
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Garry");
        table.put(100, "Spongebob");

        // to display an element
        System.out.println(table.get(321));

         // Removing an element
         table.remove(555);

        // Getting all elements
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + " " + key + " " + table.get(key));
        }

        // 

        Hashtable<String,String> table_string = new Hashtable<>(10); //10 is the capacity

        // add elements
        table_string.put("100", "Spongebob");
        table_string.put("123", "Patrick");
        table_string.put("321", "Sandy");
        table_string.put("555", "Squidward");
        table_string.put("777", "Garry");
        table_string.put("100", "Spongebob");

        // to display an element
        System.out.println(table_string.get("321"));

         // Removing an element
         table_string.remove("555");

        // Getting all elements
        for(String key : table_string.keySet()){
            System.out.println(key.hashCode() % 13 + " " + key + " " + table_string.get(key));
        }


       
    }
}
