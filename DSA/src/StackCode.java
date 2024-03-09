import java.util.Stack;
public class StackCode{
    public static void main(String [] args){
        // stacks
        /*
         * Stack is LIFO - Last in First Out
         * Store objects into a sort of 'vertical tower'
         * push() to add to the top
         * pop() to remove from the top
         * 
         * Stack methods: push(),pop(), peek(), empty(), search()
         */

         Stack<String> stack = new Stack<String>();

         

         //adding items
         stack.push("Minecraft");
         stack.push("GTA");
         stack.push("NFS");
         stack.push("FIFA");

         System.out.println(stack.empty()); //check if empty

         System.out.println(stack); // print all items

         //to remove
         stack.pop();
         System.out.println(stack);

         //to check the top most item
         System.out.println(stack.peek());

        //  to search
        System.out.println(stack.search("Minecraft")); //3 (index is from 1 R-L)

        //adding many items
        for(int i = 0; i < 10; i++){
            stack.push("Call of Duty");
        }
        System.out.println(stack);

        /*
         * USES OF STACK
         * Und/redo features in text editors
         * Moving forward/backwards through browser features
         * Backtracking algorithms(maza, file directories)
         * Calling functions(call stack)
         */


    }
}
