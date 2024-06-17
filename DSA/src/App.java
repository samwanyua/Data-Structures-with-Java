public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(fact(0));
    }

    public static int fact(int n){
        // assumption is that n is a positive integer or 0
        if(n >=1){
            return n * fact(n - 1);
        }
        else{
            return 1;
        }
    }
}
