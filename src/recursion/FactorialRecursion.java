package recursion;

public class FactorialRecursion {
    public void main(String[] args) {
        int i = 5;
        int result = factorial(i);
        System.out.println(result);
    }












































    private static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }

    }
}
