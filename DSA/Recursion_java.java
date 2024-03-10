public class Recursion_java {
    public static void main(String [] args){
        /* RECURSION

         * When a thing is defined in terms of itself
         * Apply the result of a procedure to a procedure
         * Divide a problem into sub-problem of the same type as the original
         * Commonly used with advanced sorting algorithms and navigating trees
         * 
         * Adv.
         * Easier to read/write
         * Easier to debug
         * 
         * Dis.
         * Sometimes slower
         * Uses more memory
         * 
         * 
         */
        walk(5);

        //finding factorial of a number
       System.out.println(factorial(7)); 

    //    x ^ y program
        System.out.println(power(2, 8));   

    }
    private static void walk (int steps) {
        //iteration
        // for(int i = 0; i < steps; i++){
        //     System.out.println("You take a step!");
        // }

        //recursion
        if(steps < 1) return; //Base case
        System.out.println("You take a step!");
        walk(steps -1); // recursive case

        /*
         * Call stack data structure - stores info about active subroutines of a computer program
         * AKA execution stack/program stack/control stack/run-time stack/machine stack
         */

    }
    public static int factorial(int num) {
        if(num < 1) return 1; //base case

        return num * factorial(num - 1);
    }
    public static int power(int base, int exponent) {
        if(exponent < 1) return 1; //Base case
        return base * power(base, exponent - 1); //recursive case

    }
}
