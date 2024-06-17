public class Fibonacci {
    public int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(3)); 
    }
}
