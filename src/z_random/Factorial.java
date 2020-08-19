package z_random;

public class Factorial {
    public void main(String[] args) {
        int i = 5;
        int result = printFactorial(i);
        System.out.println(result);
    }




































    private static int printFactorial(int number) {
        int factorial = 1;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
}
