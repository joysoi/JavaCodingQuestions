package z_random;

public class Fibonacci_Rec {
    public void main(String[] args) {
        int i = 9;
        int result = fibonacci(i);
        System.out.println(result);
    }








































    private static int fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
