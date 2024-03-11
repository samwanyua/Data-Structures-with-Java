public class Execution_time {
    public static void main(String[] args) {
        // calculating execution time
        long start = System.nanoTime();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long duration = System.nanoTime() - start;
        System.out.println(duration + " ms");
    }
}
